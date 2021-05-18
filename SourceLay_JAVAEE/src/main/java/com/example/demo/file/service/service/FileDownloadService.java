package com.example.demo.file.service.service;

public interface FileDownloadService {
    public String GetDownloadUrl(String key, int minutes);

    public String DownloadFile(long fid,int minutes);

    public String DownloadShareFile(long sid,int minutes);
}
