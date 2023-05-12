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
import com.steel.school.domain.TbTeacher;
import com.steel.school.service.ITbTeacherService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教师信息Controller
 * 
 * @author steel
 * @date 2023-02-27
 */
@RestController
@RequestMapping("/teacher/info")
public class TbTeacherController extends BaseController
{
    @Autowired
    private ITbTeacherService tbTeacherService;

    /**
     * 查询教师信息列表
     */
    @PreAuthorize("@ss.hasPermi('teacher:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbTeacher tbTeacher)
    {
        startPage();
        List<TbTeacher> list = tbTeacherService.selectTbTeacherList(tbTeacher);
        return getDataTable(list);
    }

    /**
     * 导出教师信息列表
     */
    @PreAuthorize("@ss.hasPermi('teacher:info:export')")
    @Log(title = "教师信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbTeacher tbTeacher)
    {
        List<TbTeacher> list = tbTeacherService.selectTbTeacherList(tbTeacher);
        ExcelUtil<TbTeacher> util = new ExcelUtil<TbTeacher>(TbTeacher.class);
        util.exportExcel(response, list, "教师信息数据");
    }

    /**
     * 获取教师信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('teacher:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tbTeacherService.selectTbTeacherById(id));
    }

    /**
     * 新增教师信息
     */
    @PreAuthorize("@ss.hasPermi('teacher:info:add')")
    @Log(title = "教师信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbTeacher tbTeacher)
    {
        return toAjax(tbTeacherService.insertTbTeacher(tbTeacher));
    }

    /**
     * 修改教师信息
     */
    @PreAuthorize("@ss.hasPermi('teacher:info:edit')")
    @Log(title = "教师信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbTeacher tbTeacher)
    {
        return toAjax(tbTeacherService.updateTbTeacher(tbTeacher));
    }

    /**
     * 删除教师信息
     */
    @PreAuthorize("@ss.hasPermi('teacher:info:remove')")
    @Log(title = "教师信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbTeacherService.deleteTbTeacherByIds(ids));
    }
}
