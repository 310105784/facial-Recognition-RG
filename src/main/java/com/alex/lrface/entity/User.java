package com.alex.lrface.entity;

import java.util.Date;

/**
 * 用户实体类
 *
 * @author: Alex
 * @createTime: 2021/1/10
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
public class User {
    private Long id;
    private String userName;
    private String loginName;
    private String passWord;
    private Date updateTime;
    private Date createTime;

    public User() {
    }

    public User(Long id, String userName, String loginName, String passWord, Date updateTime, Date createTime) {
        this.id = id;
        this.userName = userName;
        this.loginName = loginName;
        this.passWord = passWord;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(512);
        sb.append("User [");
        sb.append(super.toString());
        sb.append("\n id=").append(this.id);
        sb.append("\n userName=").append(this.userName);
        sb.append("\n loginName=").append(this.loginName);
        sb.append("\n passWord=").append(this.passWord);
        sb.append("\n updateTime=").append(this.updateTime);
        sb.append("\n createTime=").append(this.createTime);
        sb.append("\n]");
        return sb.toString();
    }
}
