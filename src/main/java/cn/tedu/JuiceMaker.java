package cn.tedu;

import java.sql.SQLOutput;

/**
 * @author liwei
 * @create 2022-03-30-10:33
 **/
public class JuiceMaker {
    private Source source;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void drink(){
        System.out.println(source.getSugar());
        System.out.println(source.getSize());
        System.out.println(source.getFruit());
    }
}
