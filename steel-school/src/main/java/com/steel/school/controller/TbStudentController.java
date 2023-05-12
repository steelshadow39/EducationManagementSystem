package com.steel.school.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.SecurityUtils;
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
import com.steel.school.domain.TbStudent;
import com.steel.school.service.ITbStudentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生Controller
 * 
 * @author steel
 * @date 2023-02-27
 */
@RestController
@RequestMapping("/student/manage" )
public class TbStudentController extends BaseController
{
    @Autowired
    private ITbStudentService tbStudentService;
    /**
     * 查询学生列表
     */
    @PreAuthorize("@ss.hasPermi('student:manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbStudent tbStudent)
    {
        startPage();
        List<TbStudent> list = tbStudentService.selectTbStudentList(tbStudent);
        return getDataTable(list);
    }
    /**
     * 导出学生列表
     */
    @PreAuthorize("@ss.hasPermi('student:manage:export')")
    @Log(title = "学生", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbStudent tbStudent)
    {
        List<TbStudent> list = tbStudentService.selectTbStudentList(tbStudent);
        ExcelUtil<TbStudent> util = new ExcelUtil<TbStudent>(TbStudent.class);
        util.exportExcel(response, list, "学生数据");
    }

    /**
     * 获取学生详细信息
     */
    @PreAuthorize("@ss.hasPermi('student:manage:query')")
    @GetMapping(value = "/{studentId}")
    public AjaxResult getInfo(@PathVariable("studentId") String studentId)
    {
        return success(tbStudentService.selectTbStudentByStudentId(studentId));
    }

    /**
     * 新增学生
     */
    @PreAuthorize("@ss.hasPermi('student:manage:add')")
    @Log(title = "学生", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbStudent tbStudent)
    {
        return toAjax(tbStudentService.insertTbStudent(tbStudent));
    }

    /**
     * 修改学生
     */
    @PreAuthorize("@ss.hasPermi('student:manage:edit')")
    @Log(title = "学生", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbStudent tbStudent)
    {
        return toAjax(tbStudentService.updateTbStudent(tbStudent));
    }

    /**
     * 删除学生
     */
    @PreAuthorize("@ss.hasPermi('student:manage:remove')")
    @Log(title = "学生", businessType = BusinessType.DELETE)
	@DeleteMapping("/{studentIds}")
    public AjaxResult remove(@PathVariable String[] studentIds)
    {
        return toAjax(tbStudentService.deleteTbStudentByStudentIds(studentIds));
    }
}
