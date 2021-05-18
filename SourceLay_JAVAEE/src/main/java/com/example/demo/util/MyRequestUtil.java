package com.example.demo.util;

import org.springframework.web.bind.ServletRequestDataBinder;

import javax.servlet.http.HttpServletRequest;

/**
 * @author dzy
 * @title: MyRequestUtil
 * @projectName demo
 * @description: 用于post的body向对象的转换
 * @date 2020/12/116:14
 */

public class MyRequestUtil {
    public static <T> T getParameterObject(HttpServletRequest request, Class<T> tClass){
        try{
            T result = tClass.newInstance();
            ServletRequestDataBinder binder = new ServletRequestDataBinder(result);
            binder.bind(request);
            return result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
