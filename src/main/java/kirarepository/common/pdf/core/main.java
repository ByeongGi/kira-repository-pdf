package kirarepository.common.pdf.core;

import kirarepository.common.pdf.bulider.PDFDocumentBulider;
import kirarepository.common.pdf.entity.PDFDocument;
import kirarepository.common.pdf.exception.FontFileExcetion;
import kirarepository.common.pdf.utill.FontReadSupport;

/**
 * Created by kira on 2016-03-20.
 */
public class main {

    public static void main(String[] args) throws FontFileExcetion {


/*
        PDFCreateSample d = new PDFCreateSample();

        d.createPdf();*/


        PDFDocument PDFDocument = new PDFDocumentBulider()
                .setPage(10)
                .setName("pdfExam")
                .setFont(FontReadSupport.getFont("SeoulHangangM.ttf"))
                .setAuthor("김병기")
                .setFontSize(15)
                .Bulid();

        PDFCreate.CreatePDF(PDFDocument);

    }
}
