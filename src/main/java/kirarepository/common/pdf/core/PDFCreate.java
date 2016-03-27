package kirarepository.common.pdf.core;

import kirarepository.common.pdf.entity.PDFDocument;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Beyeong Gi Kim on 2016-03-27.
 */
public class PDFCreate {


    public static void CreatePDF(PDFDocument PDFDocument){

        // 문서 객체를 생성
        PDDocument doc = new PDDocument();

        // 페이지 객체를 생성
        ArrayList<PDPage> pdfPageList = new ArrayList<PDPage>();

        for (int pdfPageNum = 0; pdfPageNum < PDFDocument.getPage(); pdfPageNum++) {
            pdfPageList.add(new PDPage());
            doc.addPage(pdfPageList.get(pdfPageNum));
        }

        // font 객체 로딩
        PDFont pdFont= getPdFont(doc, PDFDocument);



    }


    /**
     *
     * @param pdDocument
     * @param pdPage
     * @param pdFont
     * @param PDFDocument
     * @return
     */
    private static PDPageContentStream CreateContent(PDDocument pdDocument, PDPage pdPage, PDFont pdFont, PDFDocument PDFDocument){

        PDPageContentStream contents = null;
        try {

            contents = new PDPageContentStream(pdDocument, pdPage);
            contents.setFont(pdFont,PDFDocument.getFontSize());



            contents.beginText();
            contents.newLineAtOffset(50, 650);
            contents.newLine();
            contents.showText("Hello World ");

            contents.endText();
            contents.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contents;
    }


    /**
     * Font 파일을 PdFont로 객체로 얻어온다.
     * @param pdfDocument
     * @param PDFDocument
     * @return
     */
    private static PDFont getPdFont(PDDocument pdfDocument, PDFDocument PDFDocument){
        PDFont pdFont = null;
        try {
            pdFont = PDType0Font.load(pdfDocument, PDFDocument.getFont());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pdFont;
    }

}
