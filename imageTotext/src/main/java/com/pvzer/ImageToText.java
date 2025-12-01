package com.pvzer;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ImageToText {
    // imagePath为图片路径，language为识别语言
    public String getWordFromImage(String imagePath, String language) {
        //创建Tesseract对象
        ITesseract tesseract = new Tesseract();
        //设置字体库路径
        tesseract.setDatapath("D:/space/tessdata");
        //设置识别语言 chi_sim/eng
        tesseract.setLanguage(language);
        //执行ocr识别
        String result = null;
        try {
            result = tesseract.doOCR(new File(imagePath));
        } catch (TesseractException e) {
            System.out.println("识别有误");
        }
        return result;
    }



}
