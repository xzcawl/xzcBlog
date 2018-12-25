package com.xzc.blog.domain.po;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Classname Blog
 * @Description TODO 博文通用类
 * @Date 2018/12/22 16:20
 * @Created by xzcawl
 */
public class BlogDetail implements Serializable{
    private static final long serialVersionUID = -6614866128645085466L;

    private int id;//索引，唯一标识

    private String title;//标题

    private String content;//文章内容

    private String author;//作者

    private LocalDateTime createTime;//创建时间

    private LocalDateTime updateTime;//修改时间

    private String state;//状态：有效1，无效0

    public BlogDetail() {
    }

    public BlogDetail(int id, String title, String content, String author, LocalDateTime createTime, LocalDateTime updateTime, String state) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BlogDetail{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", state='" + state + '\'' +
                '}';
    }
}
