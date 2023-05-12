package com.steel.school.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steel.school.mapper.TbClasseMapper;
import com.steel.school.domain.TbClasse;
import com.steel.school.service.ITbClasseService;

/**
 * 班级Service业务层处理
 * 
 * @author steel
 * @date 2023-02-27
 */
@Service
public class TbClasseServiceImpl implements ITbClasseService 
{
    @Autowired
    private TbClasseMapper tbClasseMapper;

    /**
     * 查询班级
     * 
     * @param Classe 班级主键
     * @return 班级
     */
    @Override
    public TbClasse selectTbClasseByClasse(Long Classe)
    {
        return tbClasseMapper.selectTbClasseByClasse(Classe);
    }

    /**
     * 查询班级列表
     * 
     * @param tbClasse 班级
     * @return 班级
     */
    @Override
    public List<TbClasse> selectTbClasseList(TbClasse tbClasse)
    {
        return tbClasseMapper.selectTbClasseList(tbClasse);
    }

    /**
     * 新增班级
     * 
     * @param tbClasse 班级
     * @return 结果
     */
    @Override
    public int insertTbClasse(TbClasse tbClasse)
    {
        return tbClasseMapper.insertTbClasse(tbClasse);
    }

    /**
     * 修改班级
     * 
     * @param tbClasse 班级
     * @return 结果
     */
    @Override
    public int updateTbClasse(TbClasse tbClasse)
    {
        return tbClasseMapper.updateTbClasse(tbClasse);
    }

    /**
     * 批量删除班级
     * 
     * @param Classes 需要删除的班级主键
     * @return 结果
     */
    @Override
    public int deleteTbClasseByClasses(Long[] Classes)
    {
        return tbClasseMapper.deleteTbClasseByClasses(Classes);
    }

    /**
     * 删除班级信息
     * 
     * @param Classe 班级主键
     * @return 结果
     */
    @Override
    public int deleteTbClasseByClasse(Long Classe)
    {
        return tbClasseMapper.deleteTbClasseByClasse(Classe);
    }
}
