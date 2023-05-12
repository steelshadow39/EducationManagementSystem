package com.steel.school.mapper;

import java.util.List;
import com.steel.school.domain.TbStudent;

/**
 * 学生Mapper接口
 * 
 * @author steel
 * @date 2023-02-27
 */
public interface TbStudentMapper 
{
    /**
     * 查询学生成绩信息
     *
     * @param studentId 学生主键
     * @return 课程集合
     */
    public List<TbStudent> selectTbStudentScoreByStudentId(String studentId);
    /**
     * 查询学生
     * 
     * @param studentId 学生主键
     * @return 学生
     */
    public TbStudent selectTbStudentByStudentId(String studentId);

    /**
     * 查询学生列表
     * 
     * @param tbStudent 学生
     * @return 学生集合
     */
    public List<TbStudent> selectTbStudentList(TbStudent tbStudent);

    /**
     * 新增学生
     * 
     * @param tbStudent 学生
     * @return 结果
     */
    public int insertTbStudent(TbStudent tbStudent);

    /**
     * 修改学生
     * 
     * @param tbStudent 学生
     * @return 结果
     */
    public int updateTbStudent(TbStudent tbStudent);

    /**
     * 删除学生
     * 
     * @param studentId 学生主键
     * @return 结果
     */
    public int deleteTbStudentByStudentId(String studentId);

    /**
     * 批量删除学生
     * 
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbStudentByStudentIds(String[] studentIds);
}
