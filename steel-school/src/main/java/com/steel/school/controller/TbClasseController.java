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
import com.steel.school.domain.TbClasse;
import com.steel.school.service.ITbClasseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 班级Controller
 * 
 * @author steel
 * @date 2023-02-27
 */
@RestController
@RequestMapping("/education/classe")
public class TbClasseController extends BaseController
{
    @Autowired
    private ITbClasseService tbClasseService;

    /**
     * 查询班级列表
     */
    @PreAuthorize("@ss.hasPermi('education:classe:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbClasse tbClasse)
    {
        startPage();
        List<TbClasse> list = tbClasseService.selectTbClasseList(tbClasse);
        return getDataTable(list);
    }

    /**
     * 导出班级列表
     */
    @PreAuthorize("@ss.hasPermi('education:classe:export')")
    @Log(title = "班级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbClasse tbClasse)
    {
        List<TbClasse> list = tbClasseService.selectTbClasseList(tbClasse);
        ExcelUtil<TbClasse> util = new ExcelUtil<TbClasse>(TbClasse.class);
        util.exportExcel(response, list, "班级数据");
    }

    /**
     * 获取班级详细信息
     */
    @PreAuthorize("@ss.hasPermi('education:classe:query')")
    @GetMapping(value = "/{Classe}")
    public AjaxResult getInfo(@PathVariable("Classe") Long Classe)
    {
        return success(tbClasseService.selectTbClasseByClasse(Classe));
    }

    /**
     * 新增班级
     */
    @PreAuthorize("@ss.hasPermi('education:classe:add')")
    @Log(title = "班级", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbClasse tbClasse)
    {
        return toAjax(tbClasseService.insertTbClasse(tbClasse));
    }

    /**
     * 修改班级
     */
    @PreAuthorize("@ss.hasPermi('education:classe:edit')")
    @Log(title = "班级", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbClasse tbClasse)
    {
        return toAjax(tbClasseService.updateTbClasse(tbClasse));
    }

    /**
     * 删除班级
     */
    @PreAuthorize("@ss.hasPermi('education:classe:remove')")
    @Log(title = "班级", businessType = BusinessType.DELETE)
	@DeleteMapping("/{Classes}")
    public AjaxResult remove(@PathVariable Long[] Classes)
    {
        return toAjax(tbClasseService.deleteTbClasseByClasses(Classes));
    }
}
