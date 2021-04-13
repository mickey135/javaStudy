package com.study.domain;

import com.study.dao.StudentDao;
import com.study.utils.MyBatisUtils;
import com.study.vo.ViewStudent;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStudentDaoImpl {

    @Test
    public void testSelectMap() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Map<Object, Object> student = dao.selectMapById(1005);

        System.out.println("CountStudent num is " + student);

    }


    @Test
    public void testSelectCountStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        int countNum = dao.countStudent();

        System.out.println("CountStudent num is " + countNum);

    }

    @Test
    public void testSelectViewStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        ViewStudent student = dao.selectStudentReturnViewStudent(1005);

        System.out.println("1005 student=" + student);

    }


    @Test
    public void testSelectMultiParam() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectMultiParam("张三", 28);

        for (Student stu : students) {
            System.out.println("student=" + stu);
        }

        sqlSession.close();
    }

    @Test
    public void testSelectStudentById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = dao.selectStudentById(1002);

        System.out.println("student=" + student);
    }

    @Test
    public void testSelectStudents() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectStudents();

        for (Student stu : students) {
            System.out.println("学生=" + stu);
        }
    }

    @Test
    public void testInsertStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1006);
        student.setName("顿山");
        student.setEmail("dunshan@qq.com");
        int nums = dao.insertStudent(student);
        sqlSession.commit();
        System.out.println("添加对象的数值：" + nums);
    }
}
