package kirarepository.common.pdf.entity;

import org.apache.pdfbox.pdmodel.font.PDFont;

import java.io.File;
import java.nio.file.Path;

/**
 * Created by kira on 2016-03-25.
 */
public class PDFDocument {
    private String Name;   // 문서의 이름
    private int Page;      // 문서의 페이지수
    private File font;     //  문서의 폰트
    private int fontSize;
    private String path;   // 문서의 경로
    private String Author; // 문서 작성자

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public File getFont() {
        return font;
    }

    public void setFont(File font) {
        this.font = font;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
