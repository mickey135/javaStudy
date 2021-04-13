package com.study.domain;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    //测试方法，测试功能
    public static void main(String[] args) throws IOException {
        //访问mybatis读取student数据
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        String sqlId = "com.study.dao.StudentDao" + "." + "insertStudent";
        Student student = new Student();
        student.setId(1004);
        student.setName("刘备");
        student.setEmail("liubei@163.com");
        student.setAge(20);
        int nums = sqlSession.insert(sqlId, student);
        sqlSession.commit();
        System.out.println("执行insert的结果：" + nums);
        sqlSession.close();
    }
}
