package com.steel.school.domain;

import jdk.internal.dynalink.linker.LinkerServices;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.List;

/**
 * 学生对象 tb_student
 * 
 * @author steel
 * @date 2023-02-27
 */
public class TbStudent extends BaseEntity
{
    private static final Long serialVersionUID = 1L;


    /** 学生学号 */
    private String studentId;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String studentName;

    /** 学生性别 */
    @Excel(name = "学生性别")
    private String studentSex;

    /** 年级 */
    @Excel(name = "年级")
    private String Grade;

    /** 班级 */
    @Excel(name = "班级")
    private String Classe;

    /** 专业编号 */
    @Excel(name = "专业编号")
    private String majorId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String majorName;

    /** 所属院系ID */
    @Excel(name = "所属院系ID")
    private String departmentId;

    /** 院系名称 */
    @Excel(name = "院系名称")
    private String departmentName;

    public void setStudentId(String studentId) 
    {
        this.studentId = studentId;
    }

    public String getStudentId() 
    {
        return studentId;
    }
    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public String getStudentName() 
    {
        return studentName;
    }
    public void setStudentSex(String studentSex) 
    {
        this.studentSex = studentSex;
    }

    public String getStudentSex() 
    {
        return studentSex;
    }
    public void setGrade(String Grade) 
    {
        this.Grade = Grade;
    }

    public String getGrade() 
    {
        return Grade;
    }
    public void setClasse(String Classe) 
    {
        this.Classe = Classe;
    }

    public String getClasse() 
    {
        return Classe;
    }
    public void setMajorId(String majorId) 
    {
        this.majorId = majorId;
    }

    public String getMajorId() 
    {
        return majorId;
    }
    public void setMajorName(String majorName) 
    {
        this.majorName = majorName;
    }

    public String getMajorName() 
    {
        return majorName;
    }
    public void setDepartmentId(String departmentId) 
    {
        this.departmentId = departmentId;
    }

    public String getDepartmentId() 
    {
        return departmentId;
    }
    public void setDepartmentName(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("studentId", getStudentId())
            .append("studentName", getStudentName())
            .append("studentSex", getStudentSex())
            .append("Grade", getGrade())
            .append("Classe", getClasse())
            .append("majorId", getMajorId())
            .append("majorName", getMajorName())
            .append("departmentId", getDepartmentId())
            .append("departmentName", getDepartmentName())
            .toString();
    }
}
