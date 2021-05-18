package com.example.demo;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.DbOp.fileSharedInfo.FileSharedInfoOp;
import com.example.demo.DbOp.fileSharedOrder.FileSharedOrderOp;
import com.example.demo.permission.Permission;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @author dzy
 * @title: PermissionTest
 * @projectName demo
 * @description:
 * @date 2020/12/113:35
 */
@SpringBootTest
public class PermissionTest {
    @Test
    void testIsPurchase() {
        System.out.println(permission.IsPurchased(4,20));
        System.out.println(permission.IsPurchased(8,20));
        System.out.println(permission.IsPurchased(2,33));
        System.out.println(permission.IsPurchased(3,33));
        System.out.println(permission.IsPurchased(5,33));
        System.out.println(permission.IsPurchased(1,66));
    }
    @Autowired
    Permission permission;
    @Test
    void testIsOwner() {
        System.out.println(permission.IsOwner(1,1));
        System.out.println(permission.IsOwner(2,22));
        System.out.println(permission.IsOwner(4,22));
        System.out.println(permission.IsOwner(6,7));
        System.out.println(permission.IsOwner(1,99));
    }
    @Autowired
    FileInfoOp fileInfoOp;
    @Test
    void IsShared() {
        System.out.println(fileInfoOp.IsShared(1));
        System.out.println(fileInfoOp.IsShared(22));
        System.out.println(fileInfoOp.IsShared(26));
        System.out.println(fileInfoOp.IsShared(27));
        System.out.println(fileInfoOp.IsShared(37));
        System.out.println(fileInfoOp.IsShared(0));
    }

    @Autowired
    FileSharedInfoOp fileSharedInfoOp;
    @Test
    void testGetSharedType() {
        System.out.println(fileSharedInfoOp.GetSharedType(1));
        System.out.println(fileSharedInfoOp.GetSharedType(4));
        System.out.println(fileSharedInfoOp.GetSharedType(2));
        System.out.println(fileSharedInfoOp.GetSharedType(33));
        System.out.println(fileSharedInfoOp.GetSharedType(6));
    }
    @Test
    void testIsDeleted() {
        System.out.println(fileSharedInfoOp.IsDeleted(1));
        System.out.println(fileSharedInfoOp.IsDeleted(4));
        System.out.println(fileSharedInfoOp.IsDeleted(2));
        System.out.println(fileSharedInfoOp.IsDeleted(33));
        System.out.println(fileSharedInfoOp.IsDeleted(6));
    }
    @Test
    void testIsPublic() {
        System.out.println(permission.IsPublic(1));
        System.out.println(permission.IsPublic(2));
        System.out.println(permission.IsPublic(3));
        System.out.println(permission.IsPublic(4));
        System.out.println(permission.IsPublic(44));
    }
    @Test
    void testIsPassword(){
        System.out.println(permission.IsPwdRight(19,"123456"));
        System.out.println(permission.IsPwdRight(19,"16"));
        System.out.println(permission.IsPwdRight(19,""));
    }
}
