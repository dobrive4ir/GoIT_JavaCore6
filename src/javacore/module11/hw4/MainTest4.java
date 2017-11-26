package javacore.module11.hw4;

import javacore.module11.FileUtils;

import java.io.File;
import java.io.IOException;

public class MainTest4 {
    private final static String FILENAME
            = "..\\GoIT_Group9\\dobryvechir_vitalii\\src\\javacore\\module11\\hw4\\testTEXT4";
    public static void main(String[] args) throws IOException {
        File file;
        if (args.length == 0) {
            file = new File(FILENAME);
        } else {
            file = new File(args[0]);
        }

        FileUtils fileUtils = new FileUtils(file);
        System.out.println(fileUtils.checkWord("a"));
    }
}
