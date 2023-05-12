package com.steel.school.mapper;

import java.util.List;
import com.steel.school.domain.TbCourse;

/**
 * 课程Mapper接口
 * 
 * @author steel
 * @date 2023-02-27
 */
public interface TbCourseMapper 
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
     * 删除课程
     * 
     * @param courseName 课程主键
     * @return 结果
     */
    public int deleteTbCourseByCourseName(String courseName);

    /**
     * 批量删除课程
     * 
     * @param courseNames 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbCourseByCourseNames(String[] courseNames);
}
