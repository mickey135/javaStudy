//package com.study.dao.impl;
//
//import com.study.dao.StudentDao;
//import com.study.domain.Student;
//import com.study.utils.MyBatisUtils;
//import org.apache.ibatis.session.SqlSession;
//
//import java.util.List;
//
//public class StudentDaoImpl implements StudentDao {
//    @Override
//    public List<Student> selectStudents() {
//        //获取SqlSession对象
//        SqlSession sqlSession = MyBatisUtils.getSqlSession();
//        String sqlId = "com.study.dao.StudentDao.selectStudents";
//        //执行sql语句，使用SqlSession类的方法
//        List<Student> students = sqlSession.selectList(sqlId);
//        //关闭
//        sqlSession.close();
//        return students;
//    }
//
//    @Override
//    public int insertStudent(Student student) {
//        //获取SqlSession对象
//        SqlSession sqlSession = MyBatisUtils.getSqlSession();
//        String sqlId = "com.study.dao.StudentDao.insertStudent";
//        //执行sql语句，使用SqlSession类的方法
//        int nums = sqlSession.insert(sqlId, student);
//        //提交事务
//        sqlSession.commit();
//        //关闭
//        sqlSession.close();
//        return nums;
//    }
//}