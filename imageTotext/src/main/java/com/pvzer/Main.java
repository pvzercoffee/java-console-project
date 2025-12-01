package com.pvzer;

public class Main {
    public static void main(String[] args) {
        ImageToText toText = new ImageToText();

        String result = toText.getWordFromImage("D:/桌面/test.png","osd");

        System.out.println(result);
    }
}