package com.xzc.blog.dao;

import com.xzc.blog.domain.po.BlogDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname BlogDetailMapper
 * @Description TODO
 * @Date 2018/12/22 17:26
 * @Created by xzcawl
 */
@Repository
public interface BlogDetailMapper {

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
    BlogDetail getQueryById(@Param("id")int id);

    /**
     * 修改博文内容
     *
     * @param blogDetail    修改后的博文内容
     */
    void updateBlogDetail(@Param("blogDetail")BlogDetail blogDetail);

    /**
     * 删除博文内容
     *
     * @param id    BlogDetail博文的唯一标识ID
     */
    void deleteById(@Param("id")int id);

    /**
     * 新增一条博文
     *
     * @param blogDetail    新增的博文详情
     */
    void addBlogDetail(@Param("blogDetail")BlogDetail blogDetail);
}
