package com.xzc.blog.web;

import com.xzc.blog.dao.BlogDetailMapper;
import com.xzc.blog.domain.po.BlogDetail;
import com.xzc.blog.service.BlogService;
import com.xzc.blog.service.impl.BlogServiceImpl;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Classname BlogServiceImplTest
 * @Description TODO
 * @Date 2018/12/24 17:29
 * @Created by xzcawl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-config.xml","classpath:spring/spring-mybatis.xml", "classpath:spring/spring-config-mvc.xml"})
public class BlogServiceImplTest {

    @Autowired
    private BlogService blogService = new BlogServiceImpl();

    @Test
    public void queryAllBlogDetail() throws Exception {
        List<BlogDetail> blogDetails = blogService.queryAllBlogDetail();
        System.out.println("blogDetails = " + blogDetails);
    }

    @Test
    public void getQueryById() throws Exception {
        BlogDetail queryById = blogService.getQueryById(1);
        System.out.println("queryById = " + queryById);
    }

    @Test
    public void updateBlogDetail() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        BlogDetail blogDetail = new BlogDetail(1,"a1","a2","a3",now,now,"1");
        blogService.updateBlogDetail(blogDetail);
    }

    @Test
    public void deleteById() throws Exception {
        blogService.deleteById(2);
    }

    @Test
    public void addBlogDetail() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        BlogDetail blogDetail = new BlogDetail(3,"a","a","a",now,now,"0");
        blogService.addBlogDetail(blogDetail);
    }

}