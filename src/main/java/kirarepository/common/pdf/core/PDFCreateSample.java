package kirarepository.common.pdf.core;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.encoding.StandardEncoding;
import org.apache.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by kira on 2016-03-20.
 */
public class PDFCreateSample {


    @Test
    public void createPdf() {

        PDDocument document = new PDDocument();
        PDPage page1 = new PDPage();
        PDPage page2 = new PDPage();
        PDPage page3 = new PDPage();
        document.addPage(page1);
        document.addPage(page2);
        document.addPage(page3);

        //PDFont font = PDType1Font.HELVETICA_BOLD;
        PDFont font = null;
        // InputStream inputStream = getClass().getResourceAsStream("font/SeoulHangangM.ttf)");

        String path = "../kira-repository pdf/src/main/resources/font/";

          try {
            font = PDType0Font.load(document
                                     ,new File(path+"SeoulHangangM.ttf")
                                     );
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            PDPageContentStream contents = new PDPageContentStream(document, page1);
            // font.encode()
            contents.beginText();
            contents.setFont(font, 15);

            contents.newLineAtOffset(50, 650);
            contents.showText("글자길이 검사합니다글자길이 검사합니다글자길이 검사합니다글자길이 검사합니다11");
            System.out.println("글자길이 검사합니다글자길이 검사합니다글자길이 검사합니다글자길이 검사합니다11".length());

            contents.endText();


            contents.beginText();
            contents.newLineAtOffset(50, 630);
            contents.showText("삽질후 배움 ㅠㅠㅠ 아놬 ");
            contents.endText();



            contents.close();
            document.save(new File("hello-world.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                document.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
