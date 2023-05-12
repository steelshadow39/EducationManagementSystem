package com.steel.school.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.List;

/**
 * 成绩查询对象 tb_score
 *
 * @author steel
 * @date 2023-02-27
 */
@Data
public class TbScore extends BaseEntity {
    private static final long serialVersionUID = 1L;


    //    private List<TbCourse> tbCourses;
    @Excel(name = "课程" )
    private List<TbCourse> tbCourses;
    /**
     * 学生ID
     */
    private String studentId;

    /**
     * 学生姓名
     */
//    @Excel(name = "学生姓名")
    private String studentName;

    /**
     * 课程名称
     */
    @Excel(name = "课程名称",width = 20,needMerge = true)
    private String courseName;

    /**
     * 成绩
     */
    @Excel(name = "成绩",width = 20,needMerge = true)
    private Long Score;


}
