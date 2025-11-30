package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "D://桌面/聊天.txt";

        File file = new File(path);

        String str = FileUtils.readFileToString(file,"utf-8");

        String[] list = str.split("\n\r");

        for (String str1 : list) {
            if(str1.contains("小狐狸xue计组:"))
                System.out.println(str1);
        }
    }
}