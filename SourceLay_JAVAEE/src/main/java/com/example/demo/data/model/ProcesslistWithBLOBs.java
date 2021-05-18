package com.example.demo.data.model;

public class ProcesslistWithBLOBs extends Processlist {
    private String info;

    private byte[] infoBinary;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public byte[] getInfoBinary() {
        return infoBinary;
    }

    public void setInfoBinary(byte[] infoBinary) {
        this.infoBinary = infoBinary;
    }
}