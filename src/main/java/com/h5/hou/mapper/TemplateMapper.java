package com.h5.hou.mapper;

import com.h5.hou.entity.Template;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TemplateMapper {
    int deleteByPrimaryKey(Integer templateId);

    int insert(Template record);

    int insertSelective(Template record);

    Template selectByPrimaryKey(Integer templateId);

    int updateByPrimaryKeySelective(Template record);

    int updateByPrimaryKey(Template record);

    List<Template> selectAll();
}