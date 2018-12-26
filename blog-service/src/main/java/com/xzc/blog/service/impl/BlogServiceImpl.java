package com.xzc.blog.service.impl;

import com.xzc.blog.dao.BlogDetailMapper;
import com.xzc.blog.domain.po.BlogDetail;
import com.xzc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Classname BlogServiceImpl
 * @Description TODO
 * @Date 2018/12/22 17:20
 * @Created by xzcawl
 */

public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogDetailMapper blogDetailMapper;

    @Override
    public List<BlogDetail> queryAllBlogDetail() {
        return blogDetailMapper.queryAllBlogDetail();
    }

    @Override
    public BlogDetail getQueryById(int id) {
        return blogDetailMapper.getQueryById(id);
    }

    @Override
    public void updateBlogDetail(BlogDetail blogDetail) {
        blogDetailMapper.updateBlogDetail(blogDetail);
    }

    @Override
    public void deleteById(int id) {
        blogDetailMapper.deleteById(id);
    }

    @Override
    public void addBlogDetail(BlogDetail blogDetail) {
        blogDetailMapper.addBlogDetail(blogDetail);
    }
}
