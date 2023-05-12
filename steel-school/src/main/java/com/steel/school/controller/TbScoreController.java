package com.steel.school.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.SecurityUtils;
import com.steel.school.domain.TbStudent;
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
import com.steel.school.domain.TbScore;
import com.steel.school.service.ITbScoreService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 成绩查询Controller
 *
 * @author steel
 * @date 2023-02-27
 */
@RestController
@RequestMapping("/student/score")
public class TbScoreController extends BaseController {
    @Autowired
    private ITbScoreService tbScoreService;

    /**
     * 查询成绩查询列表
     */
    @PreAuthorize("@ss.hasPermi('student:score:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbScore tbScore) {
        startPage();
        List<TbScore> list = tbScoreService.selectTbScoreList(tbScore);
        return getDataTable(list);
    }

    /***
     * TODO: 2023/3/12 9:49  学生个人使用 成绩 专业号 专业名
     *
     * @return com.ruoyi.common.core.page.TableDataInfo
     * @author steelshaodw
     * @update_at 2023/3/12 9:49
     */
    @PreAuthorize("@ss.hasPermi('student:score:myinfo')")
    @GetMapping("/myinfo")
    public TableDataInfo myinfo() {
        startPage();
        List<TbScore> list = tbScoreService.selectTbStudentScoreByStudentId(SecurityUtils.getUsername());
        return getDataTable(list);
    }


    /**
     * 导出成绩查询列表
     */
    @PreAuthorize("@ss.hasPermi('student:score:export')")
    @Log(title = "成绩查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response) {
        List<TbScore> list = tbScoreService.selectTbStudentScoreByStudentId(SecurityUtils.getUsername());
        System.out.println(list);
        ExcelUtil<TbScore> util = new ExcelUtil<TbScore>(TbScore.class);
        util.exportExcel(response,list, "成绩查询数据");
    }

    /**
     * TODO: 2023/3/13 17:11 教师 管理员使用  根据学号获取学生成绩
     *
     * @param studentId java.lang.String
     * @return com.ruoyi.common.core.page.TableDataInfo
     * @author steelshaodw
     * @update_at 2023/3/13 17:11
     */
    @PreAuthorize("@ss.hasPermi('student:score:query')")
    @GetMapping(value = "/{studentId}")
    public TableDataInfo getInfo(@PathVariable("studentId") String studentId) {
        startPage();
        List<TbScore> list = tbScoreService.selectTbScoreByStudentId(studentId);
        return getDataTable(list);
    }

    /**
     * 新增成绩查询
     */
    @PreAuthorize("@ss.hasPermi('student:score:add')")
    @Log(title = "成绩查询", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbScore tbScore) {
        return toAjax(tbScoreService.insertTbScore(tbScore));
    }

    /**
     * 修改成绩查询
     */
    @PreAuthorize("@ss.hasPermi('student:score:edit')")
    @Log(title = "成绩查询", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbScore tbScore) {
        return toAjax(tbScoreService.updateTbScore(tbScore));
    }

    /**
     * 删除成绩查询
     */
    @PreAuthorize("@ss.hasPermi('student:score:remove')")
    @Log(title = "成绩查询", businessType = BusinessType.DELETE)
    @DeleteMapping("/{studentIds}")
    public AjaxResult remove(@PathVariable String[] studentIds) {
        return toAjax(tbScoreService.deleteTbScoreByStudentIds(studentIds));
    }
}
