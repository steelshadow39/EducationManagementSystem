package com.steel.school.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steel.school.mapper.TbTeacherMapper;
import com.steel.school.domain.TbTeacher;
import com.steel.school.service.ITbTeacherService;

/**
 * 教师信息Service业务层处理
 * 
 * @author steel
 * @date 2023-02-27
 */
@Service
public class TbTeacherServiceImpl implements ITbTeacherService 
{
    @Autowired
    private TbTeacherMapper tbTeacherMapper;

    /**
     * 查询教师信息
     * 
     * @param id 教师信息主键
     * @return 教师信息
     */
    @Override
    public TbTeacher selectTbTeacherById(Long id)
    {
        return tbTeacherMapper.selectTbTeacherById(id);
    }

    /**
     * 查询教师信息列表
     * 
     * @param tbTeacher 教师信息
     * @return 教师信息
     */
    @Override
    public List<TbTeacher> selectTbTeacherList(TbTeacher tbTeacher)
    {
        return tbTeacherMapper.selectTbTeacherList(tbTeacher);
    }

    /**
     * 新增教师信息
     * 
     * @param tbTeacher 教师信息
     * @return 结果
     */
    @Override
    public int insertTbTeacher(TbTeacher tbTeacher)
    {
        return tbTeacherMapper.insertTbTeacher(tbTeacher);
    }

    /**
     * 修改教师信息
     * 
     * @param tbTeacher 教师信息
     * @return 结果
     */
    @Override
    public int updateTbTeacher(TbTeacher tbTeacher)
    {
        return tbTeacherMapper.updateTbTeacher(tbTeacher);
    }

    /**
     * 批量删除教师信息
     * 
     * @param ids 需要删除的教师信息主键
     * @return 结果
     */
    @Override
    public int deleteTbTeacherByIds(Long[] ids)
    {
        return tbTeacherMapper.deleteTbTeacherByIds(ids);
    }

    /**
     * 删除教师信息信息
     * 
     * @param id 教师信息主键
     * @return 结果
     */
    @Override
    public int deleteTbTeacherById(Long id)
    {
        return tbTeacherMapper.deleteTbTeacherById(id);
    }
}
