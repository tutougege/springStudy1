package cn.tedu;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liwei
 * @create 2022-03-30-10:12
 **/
public class IOCDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        Source source = (Source) app.getBean("source");
        System.out.println(source.getFruit());
        System.out.println(source.getSize());
        System.out.println(source.getSugar());
    }
    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        JuiceMaker j = (JuiceMaker) app.getBean("juicemaker");
        j.drink();
    }
}
