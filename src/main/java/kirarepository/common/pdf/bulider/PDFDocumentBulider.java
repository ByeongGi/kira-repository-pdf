package kirarepository.common.pdf.bulider;

import kirarepository.common.pdf.entity.PDFDocument;

import java.io.File;

/**
 * Created by Beyeong Gi Kim on 2016-03-27.
 */
public class PDFDocumentBulider {


    private PDFDocument PDFDocument;
    private static final String POSTFIX_EXTENSION= ".pdf";

    public PDFDocumentBulider() {
        this.PDFDocument = new PDFDocument();
    }

    public PDFDocument Bulid() {
        return this.PDFDocument;
    }

    public PDFDocumentBulider setName(String name){
        PDFDocument.setName(name+POSTFIX_EXTENSION);
        return this;
    }

    public PDFDocumentBulider setPage(int page){
        PDFDocument.setPage(page);
        return this;
    }

    public PDFDocumentBulider setFont(File font){
        PDFDocument.setFont(font);
        return this;
    }

    public PDFDocumentBulider setPath(String path){
        PDFDocument.setPath(path);
        return this;
    }

    public PDFDocumentBulider setAuthor(String Author){
        PDFDocument.setAuthor(Author);
        return this;
    }

    public PDFDocumentBulider setFontSize(int fontSize){
        PDFDocument.setFontSize(fontSize);
        return this;
    }
}
