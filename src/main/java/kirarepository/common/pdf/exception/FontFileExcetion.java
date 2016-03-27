package kirarepository.common.pdf.exception;

/**
 * Created by Beyeong Gi Kim on 2016-03-27.
 */
public class FontFileExcetion extends Exception {


    public FontFileExcetion(String message) {
        super(message);
    }

    public FontFileExcetion() {
        super("폰트 파일을 찾을수 없습니다.");
    }
}
