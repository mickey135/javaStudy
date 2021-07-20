package org.example.ba06;

public class Student {

    private String name;
    private int age;

    private School school;

    public Student() {
//        System.out.println("spring会调用类的无参数构造方法创建对象");
    }

    public void setSchool(School school) {
        System.out.println("setSchool:" + school);
        this.school = school;
    }

    public void setName(String name) {
//        System.out.println("setName:" + name);
        this.name = name;
    }

    public void setAge(int age) {
//        System.out.println("setAge:" + age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
