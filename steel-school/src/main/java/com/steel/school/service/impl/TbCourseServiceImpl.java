package com.steel.school.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steel.school.mapper.TbCourseMapper;
import com.steel.school.domain.TbCourse;
import com.steel.school.service.ITbCourseService;

/**
 * 课程Service业务层处理
 * 
 * @author steel
 * @date 2023-02-27
 */
@Service
public class TbCourseServiceImpl implements ITbCourseService 
{
    @Autowired
    private TbCourseMapper tbCourseMapper;

    /**
     * 查询课程
     * 
     * @param courseName 课程主键
     * @return 课程
     */
    @Override
    public TbCourse selectTbCourseByCourseName(String courseName)
    {
        return tbCourseMapper.selectTbCourseByCourseName(courseName);
    }

    /**
     * 查询课程列表
     * 
     * @param tbCourse 课程
     * @return 课程
     */
    @Override
    public List<TbCourse> selectTbCourseList(TbCourse tbCourse)
    {
        return tbCourseMapper.selectTbCourseList(tbCourse);
    }

    /**
     * 新增课程
     * 
     * @param tbCourse 课程
     * @return 结果
     */
    @Override
    public int insertTbCourse(TbCourse tbCourse)
    {
        return tbCourseMapper.insertTbCourse(tbCourse);
    }

    /**
     * 修改课程
     * 
     * @param tbCourse 课程
     * @return 结果
     */
    @Override
    public int updateTbCourse(TbCourse tbCourse)
    {
        return tbCourseMapper.updateTbCourse(tbCourse);
    }

    /**
     * 批量删除课程
     * 
     * @param courseNames 需要删除的课程主键
     * @return 结果
     */
    @Override
    public int deleteTbCourseByCourseNames(String[] courseNames)
    {
        return tbCourseMapper.deleteTbCourseByCourseNames(courseNames);
    }

    /**
     * 删除课程信息
     * 
     * @param courseName 课程主键
     * @return 结果
     */
    @Override
    public int deleteTbCourseByCourseName(String courseName)
    {
        return tbCourseMapper.deleteTbCourseByCourseName(courseName);
    }
}
