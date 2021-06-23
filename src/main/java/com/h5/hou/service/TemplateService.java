package com.h5.hou.service;

import com.h5.hou.entity.Template;

import java.util.List;

public interface TemplateService {
    int deleteByPrimaryKey(Integer templateId);

    int insert(Template record);

    int insertSelective(Template record);

    Template selectByPrimaryKey(Integer templateId);

    int updateByPrimaryKeySelective(Template record);

    int updateByPrimaryKey(Template record);
    List<Template> selectAll();
}
