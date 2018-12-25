package com.xzc.blog.service;

import com.xzc.blog.domain.po.BlogDetail;

import java.util.List;

/**
 * @Classname BlogService
 * @Description TODO
 * @Date 2018/12/22 16:41
 * @Created by xzcawl
 */
public interface BlogService {

    /**
     * 查询全部的博文记录.
     *
     * @return 数据库中所有的博文
     */
    List<BlogDetail> queryAllBlogDetail();

    /**
     * 查询单个博文
     *
     * @param id    BlogDetail博文的唯一标识ID
     * @return  根据ID查询出来的内容
     */
    BlogDetail getQueryById(int id);

    /**
     * 修改博文内容
     *
     * @param blogDetail    修改后的博文内容
     */
    void updateBlogDetail(BlogDetail blogDetail);

    /**
     * 删除博文内容
     *
     * @param id    BlogDetail博文的唯一标识ID
     */
    void deleteById(int id);

    /**
     * 新增一条博文
     *
     * @param blogDetail    新增的博文详情
     */
    void addBlogDetail(BlogDetail blogDetail);
}
