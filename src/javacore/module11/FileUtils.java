package javacore.module11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.stream.Stream;

public class FileUtils {
    private final File file;

    public FileUtils(File file) {
        this.file = file;
    }

    /*
    TASK 1
    You should create method which replace words in the File and returns String with replaced values
    a) read file, save to string var
    b) replace words
    c) return new string
    String replacer(Map<String, String> map)
     */
    public String replacer (Map <String, String> replacerMap) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        Path path = Paths.get(this.file.getPath());

        Files.lines(path)
                .map(str -> str + "\r\n")
                .map(line -> {
                    final String[] result = {line};
                    replacerMap.forEach((key, value) -> {
                        if (result[0].contains(key)) {
                            result[0] = result[0].replaceAll(key, value);
                        }
                    });
                    return result[0];
                })
                .forEach(str -> stringBuilder.append(str));

        return stringBuilder.toString();
    }

    /*
    TASK 2
    You should create method which replace words in the File and rewrite File content with new values
    a) read file, save to string var
    b) replace words
    c) rewrite file with string
    File fileContentReplacer(Map<String, String> map)
     */
    public File fileContentReplacer(Map<String, String> replacerMap) throws IOException {
        String content = replacer(replacerMap);
        File file = getFile();
        Path path = Paths.get(file.getPath());

        return fileContentWriter(path, content.getBytes(), StandardOpenOption.WRITE);
    }


    /*
    TASK 3
    You should create method which replace words in the File and write result to existing File content
    a) read file, save to string var
    b) replace words
    c) add string to the existing file content
    File fileContentMerger(Map<String, String> map)
     */
    public File fileContentMerger(Map<String, String> replacerMap) throws IOException {
        String content = replacer(replacerMap);
        File file = getFile();
        Path path = Paths.get(file.getPath());

        return fileContentWriter(path, content.getBytes(), StandardOpenOption.APPEND);
    }


    /*
    TASK 4
    Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
    a) read file, save to string var
    b) calculate how many time the word occurs
    c) print result
    int checkWord(String word)
    Write this task with usual try and try with resources (two versions)
     */
    public int checkWord(String word) throws IOException {
        Path path = Paths.get(this.file.getPath());

        long counter = Files
                .lines(path)
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(currentWord -> currentWord.equals(word))
                .count();

        return (int)counter;
    }

    public File getFile() {
        return file;
    }

    private File fileContentWriter (Path path, byte [] content, StandardOpenOption option) throws IOException {
        Files.write(path, content, option);
        return path.toFile();
    }
}
