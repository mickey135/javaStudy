package org.example;

import org.example.ba04.School;
import org.example.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest04 {

    @Test
    public void test01() {
        String config = "./ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student对象=" + myStudent);

    }
}
