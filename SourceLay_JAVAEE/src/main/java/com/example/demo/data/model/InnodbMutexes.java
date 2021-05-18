package com.example.demo.data.model;

public class InnodbMutexes {
    private String name;

    private String createFile;

    private Integer createLine;

    private Long osWaits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCreateFile() {
        return createFile;
    }

    public void setCreateFile(String createFile) {
        this.createFile = createFile == null ? null : createFile.trim();
    }

    public Integer getCreateLine() {
        return createLine;
    }

    public void setCreateLine(Integer createLine) {
        this.createLine = createLine;
    }

    public Long getOsWaits() {
        return osWaits;
    }

    public void setOsWaits(Long osWaits) {
        this.osWaits = osWaits;
    }
}