package org.example;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class RichTextToPDF {
    public static void main(String[] args) {
        try {
            // 创建Document对象
            Document document = new Document();
            // 创建PdfWriter对象，关联到输出文件
            PdfWriter.getInstance(document, new FileOutputStream("output.pdf"));
            // 打开文档
            document.open();
            // 假设这里有富文本内容，简单示例为一段普通文本
            String richText = "这是一段富文本内容";
            // 设置字体
            Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.NORMAL);
            // 创建段落并添加到文档
            Paragraph paragraph = new Paragraph(richText, font);
            document.add(paragraph);
            // 关闭文档
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}