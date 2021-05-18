package com.example.demo.data.model;

public class InnodbFtDefaultStopword {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}