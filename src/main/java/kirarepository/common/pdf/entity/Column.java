package kirarepository.common.pdf.entity;

/**
 *
 * Entity Object : Column
 * Table의 Column으로 객체로 추상화
 *
 * Created by kira on 2016-03-25.
 */
public class Column {

    private String name;
    private float width;


    public Column(String name, float width) {
        this.name = name;
        this.width = width;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
