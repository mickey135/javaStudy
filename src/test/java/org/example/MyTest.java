package org.example;

import org.example.ba01.Student;
import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;

public class MyTest {

    @Test
    public void testSort() {
        int[] a = new int[6];
        a[0] = 3;
        a[1] = 5;
        a[2] = 4;
        a[3] = 1;
        a[4] = 2;
        a[5] = 6;
        int n = a.length;
        bubbleSort(a, n);
        System.out.println(Arrays.toString(a));
        insertionSort(a, n);
        System.out.println(Arrays.toString(a));
    }

    public void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    public void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    @Test
    public void test01() {
        String config = "./ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student对象：" + myStudent);

        myStudent.setAge(31);

        System.out.println("getAge:" + myStudent.getAge());
    }

    @Test
    public void test02() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("someService");

        service.doSome();
    }

    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量:" + nums);
        String names[] = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date my = (Date) ac.getBean("myDate");
        System.out.println("Date:" + my);
    }
}
