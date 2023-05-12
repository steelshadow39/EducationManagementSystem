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
import com.steel.school.domain.TbMajor;
import com.steel.school.service.ITbMajorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 专业Controller
 * 
 * @author steel
 * @date 2023-03-01
 */
@RestController
@RequestMapping("/education/major")
public class TbMajorController extends BaseController
{
    @Autowired
    private ITbMajorService tbMajorService;

    /**
     * 查询专业列表
     */
    @PreAuthorize("@ss.hasPermi('education:major:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbMajor tbMajor)
    {
        startPage();
        List<TbMajor> list = tbMajorService.selectTbMajorList(tbMajor);
        return getDataTable(list);
    }

    /**
     * 导出专业列表
     */
    @PreAuthorize("@ss.hasPermi('education:major:export')")
    @Log(title = "专业", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbMajor tbMajor)
    {
        List<TbMajor> list = tbMajorService.selectTbMajorList(tbMajor);
        ExcelUtil<TbMajor> util = new ExcelUtil<TbMajor>(TbMajor.class);
        util.exportExcel(response, list, "专业数据");
    }

    /**
     * 获取专业详细信息
     */
    @PreAuthorize("@ss.hasPermi('education:major:query')")
    @GetMapping(value = "/{majorId}")
    public AjaxResult getInfo(@PathVariable("majorId") String majorId)
    {
        return success(tbMajorService.selectTbMajorByMajorId(majorId));
    }

    /**
     * 新增专业
     */
    @PreAuthorize("@ss.hasPermi('education:major:add')")
    @Log(title = "专业", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbMajor tbMajor)
    {
        return toAjax(tbMajorService.insertTbMajor(tbMajor));
    }

    /**
     * 修改专业
     */
    @PreAuthorize("@ss.hasPermi('education:major:edit')")
    @Log(title = "专业", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbMajor tbMajor)
    {
        return toAjax(tbMajorService.updateTbMajor(tbMajor));
    }

    /**
     * 删除专业
     */
    @PreAuthorize("@ss.hasPermi('education:major:remove')")
    @Log(title = "专业", businessType = BusinessType.DELETE)
	@DeleteMapping("/{majorIds}")
    public AjaxResult remove(@PathVariable String[] majorIds)
    {
        return toAjax(tbMajorService.deleteTbMajorByMajorIds(majorIds));
    }
}
