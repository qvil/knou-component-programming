package kr.ac.knou.qvil.gradleexample.polymorphism;

import kr.ac.knou.qvil.gradleexample.GradleExampleApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class TVUser {

    public static void main(String[] args) {

        SpringApplication.run(TVUser.class, args);

        TV tv = ApplicationContextProvider.getApplicationContext().getBean("samsungTV", TV.class);

        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
