package javacore.module11.hw2;

import javacore.module11.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainTest2 {
    private final static String FILENAME = "..\\GoIT_Group9\\dobryvechir_vitalii\\src\\javacore\\module11\\hw2\\testTEXT2";
    public static void main(String[] args) throws IOException {
        File file;
        Map<String, String> replaserMap = new HashMap<>();
        replaserMap.put("a", "!");
        replaserMap.put("bb", "!!");

        if (args.length == 0) {
            file = new File(FILENAME);
        } else {
            file = new File(args[0]);
        }


        FileUtils fileUtils = new FileUtils(file);
        fileUtils.fileContentReplacer(replaserMap);
    }
}
