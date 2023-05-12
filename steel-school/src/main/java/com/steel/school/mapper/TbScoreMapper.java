package com.steel.school.mapper;

import java.util.List;
import com.steel.school.domain.TbScore;
import org.apache.poi.ss.formula.functions.T;

/**
 * 成绩查询Mapper接口
 * 
 * @author steel
 * @date 2023-02-27
 */
public interface TbScoreMapper
{
    /**
     * TODO: 2023/3/12 9:07  id查询成绩及课程专业号和名称
     *
     * @param studentId java.lang.String
     * @return java.util.List<com.steel.school.domain.TbScore>
     * @author steelshaodw
     * @update_at 2023/3/12 9:07
     */
    public List<TbScore> selectTbStudentScoreByStudentId(String studentId);

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
     * 删除成绩查询
     * 
     * @param studentId 成绩查询主键
     * @return 结果
     */
    public int deleteTbScoreByStudentId(String studentId);

    /**
     * 批量删除成绩查询
     * 
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbScoreByStudentIds(String[] studentIds);
}
