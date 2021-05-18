package com.example.demo;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.file.service.impl.FileDownloadImpl;
import com.example.demo.file.service.service.FileDownloadService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FileTest {
    @Autowired
    FileDownloadService fileDownloadService;

    @Test
    void TestDownLoadFile1(){
        System.out.println(
                fileDownloadService.DownloadFile(1,30)
        );
    }

    @Test
    void TestDownLoadFile2(){
        System.out.println(
                fileDownloadService.DownloadFile(2,30)
        );
    }

    @Test
    void TestDownLoadShare1(){
        System.out.println(
                fileDownloadService.DownloadShareFile(1,30)
        );
    }

    @Test
    void TestDonwLoadShare2(){
        System.out.println(
                fileDownloadService.DownloadShareFile(4,30)
        );
    }

    @Autowired
    FileInfoOp fileInfoOp;
    @Test
    void testSetIsShared () {
        System.out.println(fileInfoOp.SetIsShared(164,(byte) 0));
    }
}
