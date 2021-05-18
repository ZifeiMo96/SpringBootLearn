package com.example.demo;

import com.example.demo.DbOp.fileLikeInfo.FileLikeInfoOp;
import com.example.demo.DbOp.fileSharedInfo.FileSharedInfoOp;
import com.example.demo.data.model.SourcelayFileSharedInfo;
import com.example.demo.like.service.impl.LikeImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author dzy
 * @title: ShareTest
 * @projectName demo
 * @description:
 * @date 2020/11/3023:08
 */
@SpringBootTest
public class ShareTest {
    @Autowired
    FileSharedInfoOp fileSharedInfoOp;
    @Test
    void testSetSharedType() {
//        System.out.println(fileSharedInfoOp.SetSharedType(1l,1l,(short) 1));
    }

    @Test
    void testSetSharedIsRecommended() {
//        System.out.println(fileSharedInfoOp.SetIsRecommended(2l, (byte) 1));
    }

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
    @Test
    void testSetSharedDescription() {
//        System.out.println(fileSharedInfoOp.SetSharedDescription(1l,"支棱不起来的dzy"));
//        System.out.println(fileSharedInfoOp.SetSharedDescription(6l,"支棱不起来的dzy"));
    }
    @Test
    void testSetSharedPassword() {
//        System.out.println(fileSharedInfoOp.SetSharedPassword(1l,"lj"));
//        System.out.println(fileSharedInfoOp.SetSharedPassword(6l,"lj"));
    }
    @Test
    void testSetIsAnonymous() {
//        System.out.println(fileSharedInfoOp.SetIsAnonymous(1l,(byte) 0));
//        System.out.println(fileSharedInfoOp.SetIsAnonymous(4l,(byte) 0));
    }
    @Test
    void testSetCost() {
//        System.out.println(fileSharedInfoOp.SetCost(1l,100));
//        System.out.println(fileSharedInfoOp.SetCost(8l,100));
    }
    @Test
    void testSharedIsExit() {
        System.out.println(fileSharedInfoOp.IsSharedExist(1l));
        System.out.println(fileSharedInfoOp.IsSharedExist(8l));
        System.out.println(fileSharedInfoOp.IsSharedExist(88l));
    }
    @Test
    void testShareFileByDefault() {
        System.out.println(fileSharedInfoOp.ShareFileByDefault(33l,33l));
        System.out.println(fileSharedInfoOp.ShareFileByDefault(1l,1l));
    }

    @Test
    void testShareFileByAll() {
        SourcelayFileSharedInfo sourcelayFileSharedInfo = new SourcelayFileSharedInfo();
        sourcelayFileSharedInfo.setId((long) 999);
        sourcelayFileSharedInfo.setFileId((long) 999);
        sourcelayFileSharedInfo.setUserId((long) 999);
        sourcelayFileSharedInfo.setSharedDesc(null);
        sourcelayFileSharedInfo.setSharedType((short) 0);
        sourcelayFileSharedInfo.setPassword("9999");
        sourcelayFileSharedInfo.setIsAnonymous((byte) 0);
        sourcelayFileSharedInfo.setCost(999);
        sourcelayFileSharedInfo.setViewCount(0);
        sourcelayFileSharedInfo.setDownloadCount(0);
        sourcelayFileSharedInfo.setIsRecommended((byte) 0);
        sourcelayFileSharedInfo.setRecommendedAt(null);
        sourcelayFileSharedInfo.setCreatedAt(new Date());
        sourcelayFileSharedInfo.setDeletedAt(null);
        sourcelayFileSharedInfo.setDeletedId(null);
        System.out.println(fileSharedInfoOp.ShareFileByAll(sourcelayFileSharedInfo));
    }
    @Test
    void testCancelCancel() {
//        System.out.println(fileSharedInfoOp.CancelCancelSharedFile(1,1));
//        System.out.println(fileSharedInfoOp.CancelCancelSharedFile(4,2));
//        System.out.println(fileSharedInfoOp.CancelCancelSharedFile(9,9));
    }

    @Test
    void testCancelAll() {
        System.out.println(fileSharedInfoOp.CancelAllSharedFile(10,37));
    }

    @Test
    void testMax() {System.out.println(fileSharedInfoOp.MaxId());}

    @Autowired
    FileLikeInfoOp fileLikeInfoOp;
    @Test
    void testMaxLike() {System.out.println(fileLikeInfoOp.MaxId());}

    @Autowired
    LikeImpl likeService;
    @Test
    void testLike() {
        System.out.println(likeService.Like(38,4,222,false));
//        System.out.println(likeService.Like(39,4,222,true));
    }
}
