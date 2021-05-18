package com.example.demo;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.DbOp.fileLikeInfo.FileLikeInfoOp;
import com.example.demo.data.dao.AttachmentsMapper;
import com.example.demo.DbOp.fileSharedInfo.FileSharedInfoOp;
import com.example.demo.file.service.impl.FileDownloadImpl;
import com.example.demo.data.model.*;
import com.example.demo.file.service.impl.FileUploadImpl;
import com.example.demo.like.service.impl.LikeImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    AttachmentsMapper attachmentsMapper;
    @Test
    void testAttachments() {
        AttachmentsExample example = new AttachmentsExample();
        AttachmentsExample.Criteria criteria = example.createCriteria();
        System.out.println(attachmentsMapper.countByExample(example));
    }

    @Autowired
    FileDownloadImpl fileDownloadService;
    @Test
    void TestUrl() {
//        String key = "b1/2d/b12db023-c5a4-4d93-96b8-8fa96ceeaff5.docx";
        System.out.println(fileDownloadService.DownloadFile(1,30));
    }



    @Autowired
    FileSharedInfoOp fileSharedInfoOp;
    @Test
    void TestFileCountPlus() {
       fileSharedInfoOp.AddDownloadCount(1l);
    }

    @Autowired
    FileUploadImpl fileUploadService;
    @Test
    void TestAddFile() {
        SourcelayFileInfo sourcelayFileInfo = new SourcelayFileInfo();
        Date date = new Date();
        sourcelayFileInfo.setId(1l);
        sourcelayFileInfo.setUserId(1l);
        sourcelayFileInfo.setName("lhr");
        sourcelayFileInfo.setType("null");
        sourcelayFileInfo.setFolder("null");
        sourcelayFileInfo.setSize(1l);
        sourcelayFileInfo.setMd5("null");
        sourcelayFileInfo.setStatus((short) 1);
        sourcelayFileInfo.setDownloadCount(0);
        sourcelayFileInfo.setLikeCount(0);
        sourcelayFileInfo.setCreatedAt(date);
        sourcelayFileInfo.setUpdatedAt(date);
        sourcelayFileInfo.setIsShared((byte) 0);
        sourcelayFileInfo.setIsEssence((byte) 0);
        sourcelayFileInfo.setDeletedAt(date);
        sourcelayFileInfo.setDeletedId(1l);
        sourcelayFileInfo.setLikeCount(1);
        fileUploadService.afterUpload(sourcelayFileInfo);
    }

    @Autowired
    FileInfoOp fileInfoOp;

    @Autowired
    FileLikeInfoOp fileLikeInfoOp;
    @Test
    void testIsLikeExist() {
        System.out.println(fileLikeInfoOp.IsLikeExist(1,1));
        System.out.println(fileLikeInfoOp.IsLikeExist(1,2));
        System.out.println(fileLikeInfoOp.IsLikeExist(2,1));
    }
    @Test
    void testAddLike() {
        System.out.println(fileLikeInfoOp.AddLike(3,3));
    }
    @Test
    void testDeleteLike() {
        System.out.println(fileLikeInfoOp.DeleteLike(3,3));
    }

    @Autowired
    LikeImpl likeService;
    @Test
    void testLike() {
//        System.out.println(likeService.Like(4,5,true));
//        System.out.println(likeService.Like(5,5,true));
//        System.out.println(likeService.Like(3,3,false));
    }
    @Test
    void testMax() {
        System.out.println(fileLikeInfoOp.MaxId());
    }


//    @Autowired
//    void testDeleteFile(long fid) {
//    }

    @Test
    void testSetSharedType() {
//        System.out.println(fileSharedInfoOp.SetSharedType(1l,1l,(short) 1));
    }

//    @Test
//    void testSetSharedIsRecommended() {
//        System.out.println(fileSharedInfoOp.SetIsRecommended(2l, (byte) 1));
//    }

    @Test
    void testCancelSharedFile() {
//        System.out.println(fileSharedInfoOp.CancelSharedFile(1l,1l));
    }

    @Test
    void testAddSharedFileViewCount() {
        System.out.println(fileSharedInfoOp.AddViewCount(3l));
        System.out.println(fileSharedInfoOp.AddViewCount(1l));
        System.out.println(fileSharedInfoOp.AddViewCount(4l));
    }
}
