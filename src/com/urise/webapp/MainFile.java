package com.urise.webapp;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * gkislin
 * 14.07.2016
 */
public class MainFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\projects\\u-rise\\JavaSE-app\\.gitignore");
        InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        fis.close();

        File file = new File("C:\\projects\\u-rise\\JavaSE-app\\.gitignore");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canWrite());
    }
}
