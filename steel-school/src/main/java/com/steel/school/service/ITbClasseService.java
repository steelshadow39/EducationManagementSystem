package com.steel.school.service;

import java.util.List;
import com.steel.school.domain.TbClasse;

/**
 * 班级Service接口
 * 
 * @author steel
 * @date 2023-02-27
 */
public interface ITbClasseService 
{
    /**
     * 查询班级
     * 
     * @param Classe 班级主键
     * @return 班级
     */
    public TbClasse selectTbClasseByClasse(Long Classe);

    /**
     * 查询班级列表
     * 
     * @param tbClasse 班级
     * @return 班级集合
     */
    public List<TbClasse> selectTbClasseList(TbClasse tbClasse);

    /**
     * 新增班级
     * 
     * @param tbClasse 班级
     * @return 结果
     */
    public int insertTbClasse(TbClasse tbClasse);

    /**
     * 修改班级
     * 
     * @param tbClasse 班级
     * @return 结果
     */
    public int updateTbClasse(TbClasse tbClasse);

    /**
     * 批量删除班级
     * 
     * @param Classes 需要删除的班级主键集合
     * @return 结果
     */
    public int deleteTbClasseByClasses(Long[] Classes);

    /**
     * 删除班级信息
     * 
     * @param Classe 班级主键
     * @return 结果
     */
    public int deleteTbClasseByClasse(Long Classe);
}
