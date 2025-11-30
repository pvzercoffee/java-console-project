import  java.util.*;

package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "3.13号9.9元\n" +
                "3.12号37.3元\n" +
                "3.11号16元\n" +
                "3.10号27元\n" +
                "3.9号19.9元\n" +
                "3.8号30.5元\n" +
                "3.7号31元";

        String temp = str.replaceAll("元", "");

        System.out.println(temp);
    }
}