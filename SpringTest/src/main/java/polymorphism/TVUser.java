package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
    public static void main(String[] args) {
//        Resource res = new ClassPathResource("./polymorphism/applicationContext.xml");
//        AbstractApplicationContext factory = new GenericXmlApplicationContext(res);
//        AbstractApplicationContext factory = new GenericXmlApplicationContext("src/main/java/applicationContext.xml");
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

        TV tv = (TV)factory.getBean("tv");
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();

        factory.close();
    }
}
