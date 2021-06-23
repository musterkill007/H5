package com.h5.hou.controller;

import com.h5.hou.entity.Template;
import com.h5.hou.service.TemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "模板模块")
@RestController
@RequestMapping("/api/template")
public class TemplateController {
    @Resource
    public TemplateService templateService;

    @ApiOperation(value = "添加模板")
    @PostMapping("/insert")
    public int insert(Template record){return templateService.insert(record);}

    @ApiOperation(value = "删除模板")
    @DeleteMapping("/delete")
    public int deleteByPrimaryKey(int templateId){return templateService.deleteByPrimaryKey(templateId);}

    @ApiOperation(value = "修改模板")
    @PutMapping("/update")
    public int updateByPrimaryKeySelective(Template record){return templateService.updateByPrimaryKeySelective(record);}

    @ApiOperation(value = "查询模板")
    @GetMapping("/select")
    public Template selectByPrimaryKey(int templateId){return templateService.selectByPrimaryKey(templateId);}

    @ApiOperation(value = "查看所有模板")
    @GetMapping("/selectall")
    public Template selectAll(){return (Template) templateService.selectAll();}
}
