package org.example;

import org.example.ba02.Student;
import org.example.ba02.School;
import org.example.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;

public class MyTest02 {

    @Test
    public void test01() {
        System.out.println("=======test01=======");
        String config = "./ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student对象=" + myStudent);
    }

    @Test
    public void test02() {
        System.out.println("===test02===");

        Student student = new Student();
        student.setName("lisi");
        student.setAge(20);

        School school = new School();
        school.setName("动力节点");
        school.setAddress("北京");

        student.setSchool(school);

        System.out.println("student===" + student);
    }

}
