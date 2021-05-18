package com.example.demo.data.model;

public class PostGoodsWithBLOBs extends PostGoods {
    private String readyContent;

    private String detailContent;

    public String getReadyContent() {
        return readyContent;
    }

    public void setReadyContent(String readyContent) {
        this.readyContent = readyContent == null ? null : readyContent.trim();
    }

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent == null ? null : detailContent.trim();
    }
}