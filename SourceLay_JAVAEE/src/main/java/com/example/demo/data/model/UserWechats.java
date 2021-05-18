package com.example.demo.data.model;

import java.util.Date;

public class UserWechats {
    private Long id;

    private Long userId;

    private String mpOpenid;

    private String devOpenid;

    private String minOpenid;

    private String nickname;

    private Byte sex;

    private String province;

    private String city;

    private String country;

    private String headimgurl;

    private String privilege;

    private String unionid;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMpOpenid() {
        return mpOpenid;
    }

    public void setMpOpenid(String mpOpenid) {
        this.mpOpenid = mpOpenid == null ? null : mpOpenid.trim();
    }

    public String getDevOpenid() {
        return devOpenid;
    }

    public void setDevOpenid(String devOpenid) {
        this.devOpenid = devOpenid == null ? null : devOpenid.trim();
    }

    public String getMinOpenid() {
        return minOpenid;
    }

    public void setMinOpenid(String minOpenid) {
        this.minOpenid = minOpenid == null ? null : minOpenid.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege == null ? null : privilege.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}