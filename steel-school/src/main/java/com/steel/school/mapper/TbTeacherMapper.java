package com.steel.school.mapper;

import java.util.List;
import com.steel.school.domain.TbTeacher;

/**
 * 教师信息Mapper接口
 * 
 * @author steel
 * @date 2023-02-27
 */
public interface TbTeacherMapper 
{
    /**
     * 查询教师信息
     * 
     * @param id 教师信息主键
     * @return 教师信息
     */
    public TbTeacher selectTbTeacherById(Long id);

    /**
     * 查询教师信息列表
     * 
     * @param tbTeacher 教师信息
     * @return 教师信息集合
     */
    public List<TbTeacher> selectTbTeacherList(TbTeacher tbTeacher);

    /**
     * 新增教师信息
     * 
     * @param tbTeacher 教师信息
     * @return 结果
     */
    public int insertTbTeacher(TbTeacher tbTeacher);

    /**
     * 修改教师信息
     * 
     * @param tbTeacher 教师信息
     * @return 结果
     */
    public int updateTbTeacher(TbTeacher tbTeacher);

    /**
     * 删除教师信息
     * 
     * @param id 教师信息主键
     * @return 结果
     */
    public int deleteTbTeacherById(Long id);

    /**
     * 批量删除教师信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbTeacherByIds(Long[] ids);
}
