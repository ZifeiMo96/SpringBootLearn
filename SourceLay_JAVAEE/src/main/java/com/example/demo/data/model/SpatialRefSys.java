package com.example.demo.data.model;

public class SpatialRefSys {
    private Short srid;

    private String authName;

    private Integer authSrid;

    private String srtext;

    public Short getSrid() {
        return srid;
    }

    public void setSrid(Short srid) {
        this.srid = srid;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName == null ? null : authName.trim();
    }

    public Integer getAuthSrid() {
        return authSrid;
    }

    public void setAuthSrid(Integer authSrid) {
        this.authSrid = authSrid;
    }

    public String getSrtext() {
        return srtext;
    }

    public void setSrtext(String srtext) {
        this.srtext = srtext == null ? null : srtext.trim();
    }
}