package kirarepository.common.pdf.utill;

import kirarepository.common.pdf.exception.FontFileExcetion;

import java.io.File;
import java.util.HashMap;

/**
 *
 * font 폴더에 있는 모든 폰트를 Hashmap에 저장후에 필요할때마다 불러온다.
 *
 * Created by Byeong Gi Kim on 2016-03-27.
 */
public class FontReadSupport {

    private static final String FONT_DIR;
    private static final HashMap<String,File> fontRepository;

    static {
        FONT_DIR = FontReadSupport.class.getClassLoader().getResource(".").getPath()+"font/";
        fontRepository = new HashMap<String, File>();
    }


    /**
     *
     */
    private static void FontFileRead(){
        File[] dir = new File(FONT_DIR).listFiles();
        for (File file: dir) {
            System.out.println("LOG 001 -  FONT FILE LIST  :::  " + file.getName());
            fontRepository.put(file.getName(),file);
        }

    }

    /**
     *
     * @param fontName
     * @return
     * @throws FontFileExcetion
     */
    public static File getFont(String fontName) throws FontFileExcetion {
        // font 파일을 읽어서 HashMap 저장한다.
        FontFileRead();

        File font = null;
        boolean isFontExist = fontRepository.containsKey(fontName);

        if (isFontExist){
            font = fontRepository.get(fontName);
        } else{
            throw  new FontFileExcetion();
        }
        return font;
    }

}
