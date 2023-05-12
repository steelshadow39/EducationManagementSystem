package com.steel.school.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 专业对象 tb_major
 * 
 * @author steel
 * @date 2023-03-01
 */
@Data
public class TbMajor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 专业编号 */
//    @Excel(name = "专业编号")
    private String majorId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String majorName;

    /** 所属院系ID */
//    @Excel(name = "所属院系ID")
    private String departmentId;

}
