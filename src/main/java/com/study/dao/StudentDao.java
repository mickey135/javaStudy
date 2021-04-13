package com.study.dao;

import com.mysql.cj.Query;
import com.study.domain.Student;
import com.study.vo.ViewStudent;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 接口操作student表
 */
public interface StudentDao {

    public Student selectStudentById(Integer id);

    List<Student> selectStudents();

    int insertStudent(Student student);

    /**
     * 多个参数：命名参数，在形参定义的前面加入@param（“自定义参数名称）
     */
    List<Student> selectMultiParam(@Param("myname") String name, @Param("myage") Integer age);

    ViewStudent selectStudentReturnViewStudent(@Param("sid") Integer id);

    int countStudent();

    Map<Object, Object> selectMapById(@Param("stuid") Integer id);
}
