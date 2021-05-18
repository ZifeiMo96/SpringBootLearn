package com.example.demo.data.model;

import java.math.BigDecimal;

public class Groups {
    private Long id;

    private String name;

    private String type;

    private String color;

    private String icon;

    private Byte Isdefault;

    private Byte isDisplay;

    private Byte isPaid;

    private BigDecimal fee;

    private Long days;

    private Double scale;

    private Byte isSubordinate;

    private Byte isCommission;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Byte getDefault() {
        return Isdefault;
    }

    public void setDefault(Byte Isdefault) {
        this.Isdefault = Isdefault;
    }

    public Byte getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Byte isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Byte getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Byte isPaid) {
        this.isPaid = isPaid;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public Byte getIsSubordinate() {
        return isSubordinate;
    }

    public void setIsSubordinate(Byte isSubordinate) {
        this.isSubordinate = isSubordinate;
    }

    public Byte getIsCommission() {
        return isCommission;
    }

    public void setIsCommission(Byte isCommission) {
        this.isCommission = isCommission;
    }
}