package com.steel.school.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steel.school.mapper.TbMajorMapper;
import com.steel.school.domain.TbMajor;
import com.steel.school.service.ITbMajorService;

/**
 * 专业Service业务层处理
 * 
 * @author steel
 * @date 2023-03-01
 */
@Service
public class TbMajorServiceImpl implements ITbMajorService 
{
    @Autowired
    private TbMajorMapper tbMajorMapper;

    /**
     * 查询专业
     * 
     * @param majorId 专业主键
     * @return 专业
     */
    @Override
    public TbMajor selectTbMajorByMajorId(String majorId)
    {
        return tbMajorMapper.selectTbMajorByMajorId(majorId);
    }

    /**
     * 查询专业列表
     * 
     * @param tbMajor 专业
     * @return 专业
     */
    @Override
    public List<TbMajor> selectTbMajorList(TbMajor tbMajor)
    {
        return tbMajorMapper.selectTbMajorList(tbMajor);
    }

    /**
     * 新增专业
     * 
     * @param tbMajor 专业
     * @return 结果
     */
    @Override
    public int insertTbMajor(TbMajor tbMajor)
    {
        return tbMajorMapper.insertTbMajor(tbMajor);
    }

    /**
     * 修改专业
     * 
     * @param tbMajor 专业
     * @return 结果
     */
    @Override
    public int updateTbMajor(TbMajor tbMajor)
    {
        return tbMajorMapper.updateTbMajor(tbMajor);
    }

    /**
     * 批量删除专业
     * 
     * @param majorIds 需要删除的专业主键
     * @return 结果
     */
    @Override
    public int deleteTbMajorByMajorIds(String[] majorIds)
    {
        return tbMajorMapper.deleteTbMajorByMajorIds(majorIds);
    }

    /**
     * 删除专业信息
     * 
     * @param majorId 专业主键
     * @return 结果
     */
    @Override
    public int deleteTbMajorByMajorId(String majorId)
    {
        return tbMajorMapper.deleteTbMajorByMajorId(majorId);
    }
}
