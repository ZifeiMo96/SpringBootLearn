package com.example.demo.share.controller;

import com.example.demo.data.model.SourcelayFileSharedInfo;
import com.example.demo.share.service.impl.ShareImpl;
import com.example.demo.util.MyRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author dzy
 * @title: ShareController
 * @projectName demo
 * @description:
 * @date 2020/11/3019:42
 */
@RestController
@RequestMapping("/share")
public class ShareController {

    @Autowired
    ShareImpl shareService;

    @PostMapping("/shareByDefault")
    public boolean CreateShareFileByDefault(@RequestParam("userId") long userId,
                                            @RequestParam("fileId") long fileId) {
        return shareService.CreateShareFileByDefault(userId, fileId);
    }

    /**
     *
     * @param req
     * @return >=0:插入id
     * -703:不是文件拥有者
     * -1:创建失败
     */
    @PostMapping("/shareByAll")
    public long CreateShareFileByAll(HttpServletRequest req) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                MyRequestUtil.getParameterObject(req, SourcelayFileSharedInfo.class);
        return shareService.CreateShareFileByAll(sourcelayFileSharedInfo);
    }

    /**
     *
     * @param req
     * @return 0:正常
     * -703:不是分享拥有者
     * -101:更新失败
     */
    @PostMapping("/update")
    public long Update(HttpServletRequest req) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                MyRequestUtil.getParameterObject(req, SourcelayFileSharedInfo.class);
        return shareService.UpdateShareFile(sourcelayFileSharedInfo);
    }

    /**
     *
     * @param id
     * @param userId
     * @return 0:正常
     * -703:不是文件分享者
     * -201:取消失败
     */
    @PostMapping("/cancelSharedFile")
    public long CancelSharedFile(@RequestParam("shareId") long id,
                                    @RequestParam("userId") long userId) {
        return shareService.CancelSharedFile(id, userId);
    }

    /**
     *
     * @param userId
     * @param fileId
     * @return 0:正常
     * -703:不是文件分享者
     * -201:取消失败
     */
    @PostMapping("/cancelAllSharedFile")
    public long CancelAllSharedFile(@RequestParam("userId") long userId,
                                       @RequestParam("fileId") long fileId) {
        return shareService.CancelAllSharedFile(userId, fileId);
    }

    /**
     *
     * @param id
     * @param userId
     * @return 0:正常
     * -703:不是文件拥有者
     * -202:撤销失败
     */
    @PostMapping("/cancelCancelSharedFile")
    public long CancelCancelSharedFile(@RequestParam("shareId") long id,
                                          @RequestParam("userId") long userId) {
        return shareService.CancelCancelSharedFile(id, userId);
    }
}
