package com.demo.dao;

import com.demo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class StudentDaoImpl implements StudentDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int getMatchCount(String sname, String sno) {
        String strSql = "select count(*) from student "
                + " where sname = ? and sno = ?";//?为参数占位符

        //forint方法已经不用了，改用forobject
        return jdbcTemplate.queryForObject(strSql, new Object[]{ sname, sno},Integer.class);
    }

    @Override
    public Student getStudentById(String sno) {
        String strSql = "select sno,sname from student "
                + " where sno = ?";
        System.out.println("##########execute sql: "+strSql);
        final Student student = new Student();
        jdbcTemplate.query(strSql, new Object[]{ sno },
                //匿名方式实现的回调函数
                new RowCallbackHandler(){

                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        //将查询结果封装到对象实例中
                        student.setSno(rs.getString("sno"));
                        student.setSname(rs.getString("sname"));
                    }

                });
        return student;
    }

    @Override
    public Student getStudentByName(String sname) {
        String strSql = "select sno,sname from student "
                + " where sname = ?";
        System.out.println("##########execute sql: "+strSql);
        final Student student = new Student();
        jdbcTemplate.query(strSql, new Object[]{ sname },
                //匿名方式实现的回调函数
                new RowCallbackHandler(){

                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        //将查询结果封装到对象实例中
                        student.setSno(rs.getString("sno"));
                        student.setSname(rs.getString("sname"));
                    }

                });
        return student;
    }
}
