package com.xzc.blog.domain.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by xzc on 2018/12/8 17:24
 */

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;//索引号

    private String nickname;//昵称

    private String username;//用户名

    private String password;//密码

    private LocalDateTime createTime;//创建账号的时间

    private LocalDateTime updateTime;//修改账号信息的时间

    private String description;//描述

    private int state;//状态

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
