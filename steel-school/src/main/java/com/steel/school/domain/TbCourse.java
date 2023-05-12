package com.steel.school.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程对象 tb_course
 *
 * @author steel
 * @date 2023-02-27
 */
@Data
public class TbCourse extends BaseEntity {
    private static final long serialVersionUID = 1L;
//    @Excel(name = "专业")
    private TbMajor tbMajor;
    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 所属专业编号
     */
    @Excel(name = "所属专业编号")
    private String majorId;

    /**
     * 年级
     */
    private String Grade;
}
