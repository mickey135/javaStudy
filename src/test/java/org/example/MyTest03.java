package org.example;

import org.example.ba03.School;
import org.example.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {

    @Test
    public void test01() {
        System.out.println("=======test01=======");
        String config = "./ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student对象=" + myStudent);

        File myFile = (File) ac.getBean("myfile");
        System.out.println("myFile==" + myFile.getName());
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
