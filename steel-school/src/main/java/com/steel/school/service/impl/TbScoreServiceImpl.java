package com.steel.school.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steel.school.mapper.TbScoreMapper;
import com.steel.school.domain.TbScore;
import com.steel.school.service.ITbScoreService;

/**
 * 成绩查询Service业务层处理
 * 
 * @author steel
 * @date 2023-02-27
 */
@Service
public class TbScoreServiceImpl implements ITbScoreService 
{
    @Autowired
    private TbScoreMapper tbScoreMapper;

    @Override
    public List<TbScore> selectTbStudentScoreByStudentId(String studentId) {
        return tbScoreMapper.selectTbStudentScoreByStudentId(studentId);
    }

    /**
     * 查询成绩查询
     * 
     * @param studentId 成绩查询主键
     * @return 成绩查询
     */
    @Override
    public List<TbScore> selectTbScoreByStudentId(String studentId)
    {
        return tbScoreMapper.selectTbScoreByStudentId(studentId);
    }

    /**
     * 查询成绩查询列表
     * 
     * @param tbScore 成绩查询
     * @return 成绩查询
     */
    @Override
    public List<TbScore> selectTbScoreList(TbScore tbScore)
    {
        return tbScoreMapper.selectTbScoreList(tbScore);
    }

    /**
     * 新增成绩查询
     * 
     * @param tbScore 成绩查询
     * @return 结果
     */
    @Override
    public int insertTbScore(TbScore tbScore)
    {
        return tbScoreMapper.insertTbScore(tbScore);
    }

    /**
     * 修改成绩查询
     * 
     * @param tbScore 成绩查询
     * @return 结果
     */
    @Override
    public int updateTbScore(TbScore tbScore)
    {
        return tbScoreMapper.updateTbScore(tbScore);
    }

    /**
     * 批量删除成绩查询
     * 
     * @param studentIds 需要删除的成绩查询主键
     * @return 结果
     */
    @Override
    public int deleteTbScoreByStudentIds(String[] studentIds)
    {
        return tbScoreMapper.deleteTbScoreByStudentIds(studentIds);
    }

    /**
     * 删除成绩查询信息
     * 
     * @param studentId 成绩查询主键
     * @return 结果
     */
    @Override
    public int deleteTbScoreByStudentId(String studentId)
    {
        return tbScoreMapper.deleteTbScoreByStudentId(studentId);
    }
}
