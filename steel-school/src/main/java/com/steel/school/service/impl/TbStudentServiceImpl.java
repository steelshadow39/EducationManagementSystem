package com.steel.school.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steel.school.mapper.TbStudentMapper;
import com.steel.school.domain.TbStudent;
import com.steel.school.service.ITbStudentService;

/**
 * 学生Service业务层处理
 * 
 * @author steel
 * @date 2023-02-27
 */
@Service
public class TbStudentServiceImpl implements ITbStudentService 
{
    @Autowired
    private TbStudentMapper tbStudentMapper;

    @Override
    public List<TbStudent> selectTbStudentScoreByStudentId(String studentId) {
        return tbStudentMapper.selectTbStudentScoreByStudentId(studentId);
    }

    /**
     * 查询学生
     * 
     * @param studentId 学生主键
     * @return 学生
     */
    @Override
    public TbStudent selectTbStudentByStudentId(String studentId)
    {
        return tbStudentMapper.selectTbStudentByStudentId(studentId);
    }

    /**
     * 查询学生列表
     * 
     * @param tbStudent 学生
     * @return 学生
     */
    @Override
    public List<TbStudent> selectTbStudentList(TbStudent tbStudent)
    {
        return tbStudentMapper.selectTbStudentList(tbStudent);
    }

    /**
     * 新增学生
     * 
     * @param tbStudent 学生
     * @return 结果
     */
    @Override
    public int insertTbStudent(TbStudent tbStudent)
    {
        return tbStudentMapper.insertTbStudent(tbStudent);
    }

    /**
     * 修改学生
     * 
     * @param tbStudent 学生
     * @return 结果
     */
    @Override
    public int updateTbStudent(TbStudent tbStudent)
    {
        return tbStudentMapper.updateTbStudent(tbStudent);
    }

    /**
     * 批量删除学生
     * 
     * @param studentIds 需要删除的学生主键
     * @return 结果
     */
    @Override
    public int deleteTbStudentByStudentIds(String[] studentIds)
    {
        return tbStudentMapper.deleteTbStudentByStudentIds(studentIds);
    }

    /**
     * 删除学生信息
     * 
     * @param studentId 学生主键
     * @return 结果
     */
    @Override
    public int deleteTbStudentByStudentId(String studentId)
    {
        return tbStudentMapper.deleteTbStudentByStudentId(studentId);
    }
}
