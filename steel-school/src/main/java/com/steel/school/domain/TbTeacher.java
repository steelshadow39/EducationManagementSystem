package com.steel.school.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教师信息对象 tb_teacher
 * 
 * @author 
 * @date 2023-02-27
 */
@Data
public class TbTeacher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */

    private Long id;

    /** 教师编号 */
    @Excel(name = "教师编号")
    private String teacherNo;

    /** 教师姓名 */
    @Excel(name = "教师姓名")
    private String teacherName;

    /** 电话 */
    @Excel(name = "电话")
    private String cellphone;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 部门号 */
    @Excel(name = "部门号")
    private Long departmentId;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 国籍 */
    @Excel(name = "国籍")
    private String county;

    /** 授课名称 */
    @Excel(name = "授课名称")
    private String courseName;
}
