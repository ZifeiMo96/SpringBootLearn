package com.example.demo.data.model;

public class InnodbTablespacesEncryption {
    private Integer space;

    private String name;

    private Integer encryptionScheme;

    private Integer keyserverRequests;

    private Integer minKeyVersion;

    private Integer currentKeyVersion;

    private Long keyRotationPageNumber;

    private Long keyRotationMaxPageNumber;

    private Integer currentKeyId;

    private Integer rotatingOrFlushing;

    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEncryptionScheme() {
        return encryptionScheme;
    }

    public void setEncryptionScheme(Integer encryptionScheme) {
        this.encryptionScheme = encryptionScheme;
    }

    public Integer getKeyserverRequests() {
        return keyserverRequests;
    }

    public void setKeyserverRequests(Integer keyserverRequests) {
        this.keyserverRequests = keyserverRequests;
    }

    public Integer getMinKeyVersion() {
        return minKeyVersion;
    }

    public void setMinKeyVersion(Integer minKeyVersion) {
        this.minKeyVersion = minKeyVersion;
    }

    public Integer getCurrentKeyVersion() {
        return currentKeyVersion;
    }

    public void setCurrentKeyVersion(Integer currentKeyVersion) {
        this.currentKeyVersion = currentKeyVersion;
    }

    public Long getKeyRotationPageNumber() {
        return keyRotationPageNumber;
    }

    public void setKeyRotationPageNumber(Long keyRotationPageNumber) {
        this.keyRotationPageNumber = keyRotationPageNumber;
    }

    public Long getKeyRotationMaxPageNumber() {
        return keyRotationMaxPageNumber;
    }

    public void setKeyRotationMaxPageNumber(Long keyRotationMaxPageNumber) {
        this.keyRotationMaxPageNumber = keyRotationMaxPageNumber;
    }

    public Integer getCurrentKeyId() {
        return currentKeyId;
    }

    public void setCurrentKeyId(Integer currentKeyId) {
        this.currentKeyId = currentKeyId;
    }

    public Integer getRotatingOrFlushing() {
        return rotatingOrFlushing;
    }

    public void setRotatingOrFlushing(Integer rotatingOrFlushing) {
        this.rotatingOrFlushing = rotatingOrFlushing;
    }
}