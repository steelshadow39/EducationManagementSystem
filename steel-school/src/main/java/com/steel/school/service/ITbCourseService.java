package com.steel.school.service;

import java.util.List;
import com.steel.school.domain.TbCourse;

/**
 * 课程Service接口
 * 
 * @author steel
 * @date 2023-02-27
 */
public interface ITbCourseService 
{
    /**
     * 查询课程
     * 
     * @param courseName 课程主键
     * @return 课程
     */
    public TbCourse selectTbCourseByCourseName(String courseName);

    /**
     * 查询课程列表
     * 
     * @param tbCourse 课程
     * @return 课程集合
     */
    public List<TbCourse> selectTbCourseList(TbCourse tbCourse);

    /**
     * 新增课程
     * 
     * @param tbCourse 课程
     * @return 结果
     */
    public int insertTbCourse(TbCourse tbCourse);

    /**
     * 修改课程
     * 
     * @param tbCourse 课程
     * @return 结果
     */
    public int updateTbCourse(TbCourse tbCourse);

    /**
     * 批量删除课程
     * 
     * @param courseNames 需要删除的课程主键集合
     * @return 结果
     */
    public int deleteTbCourseByCourseNames(String[] courseNames);

    /**
     * 删除课程信息
     * 
     * @param courseName 课程主键
     * @return 结果
     */
    public int deleteTbCourseByCourseName(String courseName);
}
