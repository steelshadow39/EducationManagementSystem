package com.steel.school.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 班级对象 tb_classe
 * 
 * @author steel
 * @date 2023-02-27
 */
public class TbClasse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级 */
    private String Classe;

    /** 年级 */
    private String Grade;

    /** 专业编号 */
    private String majorId;

    public void setClasse(String Classe) 
    {
        this.Classe = Classe;
    }

    public String getClasse() 
    {
        return Classe;
    }
    public void setGrade(String Grade) 
    {
        this.Grade = Grade;
    }

    public String getGrade() 
    {
        return Grade;
    }
    public void setMajorId(String majorId) 
    {
        this.majorId = majorId;
    }

    public String getMajorId() 
    {
        return majorId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("Classe", getClasse())
            .append("Grade", getGrade())
            .append("majorId", getMajorId())
            .toString();
    }
}
