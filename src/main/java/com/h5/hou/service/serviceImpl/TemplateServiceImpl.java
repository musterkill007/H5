package com.h5.hou.service.serviceImpl;

import com.h5.hou.entity.Template;
import com.h5.hou.mapper.TemplateMapper;
import com.h5.hou.service.TemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService {
    @Resource
    public TemplateMapper templateMapper;

    @Override
    public int deleteByPrimaryKey(Integer templateId) {
        return templateMapper.deleteByPrimaryKey(templateId);
    }

    @Override
    public int insert(Template record) {
        return templateMapper.insert(record);
    }

    @Override
    public int insertSelective(Template record) {
        return templateMapper.insertSelective(record);
    }

    @Override
    public Template selectByPrimaryKey(Integer templateId) {
        return templateMapper.selectByPrimaryKey(templateId);
    }

    @Override
    public int updateByPrimaryKeySelective(Template record) {
        return templateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Template record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Template> selectAll() {
        return templateMapper.selectAll();
    }
}
