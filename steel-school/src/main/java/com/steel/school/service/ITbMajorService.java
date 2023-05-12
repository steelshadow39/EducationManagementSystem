package com.steel.school.service;

import java.util.List;
import com.steel.school.domain.TbMajor;

/**
 * 专业Service接口
 * 
 * @author steel
 * @date 2023-03-01
 */
public interface ITbMajorService 
{
    /**
     * 查询专业
     * 
     * @param majorId 专业主键
     * @return 专业
     */
    public TbMajor selectTbMajorByMajorId(String majorId);

    /**
     * 查询专业列表
     * 
     * @param tbMajor 专业
     * @return 专业集合
     */
    public List<TbMajor> selectTbMajorList(TbMajor tbMajor);

    /**
     * 新增专业
     * 
     * @param tbMajor 专业
     * @return 结果
     */
    public int insertTbMajor(TbMajor tbMajor);

    /**
     * 修改专业
     * 
     * @param tbMajor 专业
     * @return 结果
     */
    public int updateTbMajor(TbMajor tbMajor);

    /**
     * 批量删除专业
     * 
     * @param majorIds 需要删除的专业主键集合
     * @return 结果
     */
    public int deleteTbMajorByMajorIds(String[] majorIds);

    /**
     * 删除专业信息
     * 
     * @param majorId 专业主键
     * @return 结果
     */
    public int deleteTbMajorByMajorId(String majorId);
}
