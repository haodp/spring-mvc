package com.demo.dao.gen.entity;

import java.util.Date;

public class MUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.user_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.pwd
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.nickname
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.sex
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.openID
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.unionID
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String unionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.auth_qq
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String authQq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.auth_weibo
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String authWeibo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.mobile
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.email
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.delete_flg
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.create_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.create_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.update_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.update_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String updateUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.id
     *
     * @return the value of m_user.id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.id
     *
     * @param id the value for m_user.id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.user_id
     *
     * @return the value of m_user.user_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.user_id
     *
     * @param userId the value for m_user.user_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.pwd
     *
     * @return the value of m_user.pwd
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.pwd
     *
     * @param pwd the value for m_user.pwd
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.nickname
     *
     * @return the value of m_user.nickname
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.nickname
     *
     * @param nickname the value for m_user.nickname
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.sex
     *
     * @return the value of m_user.sex
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.sex
     *
     * @param sex the value for m_user.sex
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.openID
     *
     * @return the value of m_user.openID
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.openID
     *
     * @param openid the value for m_user.openID
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.unionID
     *
     * @return the value of m_user.unionID
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.unionID
     *
     * @param unionid the value for m_user.unionID
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.auth_qq
     *
     * @return the value of m_user.auth_qq
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getAuthQq() {
        return authQq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.auth_qq
     *
     * @param authQq the value for m_user.auth_qq
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setAuthQq(String authQq) {
        this.authQq = authQq == null ? null : authQq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.auth_weibo
     *
     * @return the value of m_user.auth_weibo
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getAuthWeibo() {
        return authWeibo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.auth_weibo
     *
     * @param authWeibo the value for m_user.auth_weibo
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setAuthWeibo(String authWeibo) {
        this.authWeibo = authWeibo == null ? null : authWeibo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.mobile
     *
     * @return the value of m_user.mobile
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.mobile
     *
     * @param mobile the value for m_user.mobile
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.email
     *
     * @return the value of m_user.email
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.email
     *
     * @param email the value for m_user.email
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.delete_flg
     *
     * @return the value of m_user.delete_flg
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.delete_flg
     *
     * @param deleteFlg the value for m_user.delete_flg
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg == null ? null : deleteFlg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.create_time
     *
     * @return the value of m_user.create_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.create_time
     *
     * @param createTime the value for m_user.create_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.create_user
     *
     * @return the value of m_user.create_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.create_user
     *
     * @param createUser the value for m_user.create_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.update_time
     *
     * @return the value of m_user.update_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.update_time
     *
     * @param updateTime the value for m_user.update_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.update_user
     *
     * @return the value of m_user.update_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.update_user
     *
     * @param updateUser the value for m_user.update_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}