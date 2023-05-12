package com.steel.school.service;

import java.util.List;
import com.steel.school.domain.TbScore;

/**
 * 成绩查询Service接口
 * 
 * @author steel
 * @date 2023-02-27
 */
public interface ITbScoreService
{
    public List<TbScore> selectTbStudentScoreByStudentId(String studentId);
    /**
     * 查询成绩查询
     * 
     * @param studentId 成绩查询主键
     * @return 成绩查询
     */
    public List<TbScore> selectTbScoreByStudentId(String studentId);

    /**
     * 查询成绩查询列表
     * 
     * @param tbScore 成绩查询
     * @return 成绩查询集合
     */
    public List<TbScore> selectTbScoreList(TbScore tbScore);

    /**
     * 新增成绩查询
     * 
     * @param tbScore 成绩查询
     * @return 结果
     */
    public int insertTbScore(TbScore tbScore);

    /**
     * 修改成绩查询
     * 
     * @param tbScore 成绩查询
     * @return 结果
     */
    public int updateTbScore(TbScore tbScore);

    /**
     * 批量删除成绩查询
     * 
     * @param studentIds 需要删除的成绩查询主键集合
     * @return 结果
     */
    public int deleteTbScoreByStudentIds(String[] studentIds);

    /**
     * 删除成绩查询信息
     * 
     * @param studentId 成绩查询主键
     * @return 结果
     */
    public int deleteTbScoreByStudentId(String studentId);
}
