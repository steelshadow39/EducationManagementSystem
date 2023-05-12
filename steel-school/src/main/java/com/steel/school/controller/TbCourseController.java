package com.steel.school.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.steel.school.domain.TbCourse;
import com.steel.school.service.ITbCourseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程Controller
 * 
 * @author steel
 * @date 2023-02-27
 */
@RestController
@RequestMapping("/education/course")
public class TbCourseController extends BaseController
{
    @Autowired
    private ITbCourseService tbCourseService;

    /**
     * 查询课程列表
     */
    @PreAuthorize("@ss.hasPermi('education:course:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbCourse tbCourse)
    {
        startPage();
        List<TbCourse> list = tbCourseService.selectTbCourseList(tbCourse);
        return getDataTable(list);
    }

    /**
     * 导出课程列表
     */
    @PreAuthorize("@ss.hasPermi('education:course:export')")
    @Log(title = "课程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbCourse tbCourse)
    {
        List<TbCourse> list = tbCourseService.selectTbCourseList(tbCourse);
        ExcelUtil<TbCourse> util = new ExcelUtil<TbCourse>(TbCourse.class);
        util.exportExcel(response, list, "课程数据");
    }

    /**
     * 获取课程详细信息
     */
    @PreAuthorize("@ss.hasPermi('education:course:query')")
    @GetMapping(value = "/{courseName}")
    public AjaxResult getInfo(@PathVariable("courseName") String courseName)
    {
        return success(tbCourseService.selectTbCourseByCourseName(courseName));
    }

    /**
     * 新增课程
     */
    @PreAuthorize("@ss.hasPermi('education:course:add')")
    @Log(title = "课程", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbCourse tbCourse)
    {
        return toAjax(tbCourseService.insertTbCourse(tbCourse));
    }

    /**
     * 修改课程
     */
    @PreAuthorize("@ss.hasPermi('education:course:edit')")
    @Log(title = "课程", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbCourse tbCourse)
    {
        return toAjax(tbCourseService.updateTbCourse(tbCourse));
    }

    /**
     * 删除课程
     */
    @PreAuthorize("@ss.hasPermi('education:course:remove')")
    @Log(title = "课程", businessType = BusinessType.DELETE)
	@DeleteMapping("/{courseNames}")
    public AjaxResult remove(@PathVariable String[] courseNames)
    {
        return toAjax(tbCourseService.deleteTbCourseByCourseNames(courseNames));
    }
}
