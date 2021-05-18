package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;


import java.util.ArrayList;

@Configuration
@EnableSwagger2  //开启swagger2
public class SwaggerConfig {
    // 定义分隔符,配置Swagger多包
    private static final String splitor = ";";

    /**
     * 重写basePackage方法，使能够实现多包访问，复制贴上去
     * @author  teavamc
     * @date 2019/1/26
     * @param
     * @return com.google.common.base.Predicate<springfox.documentation.RequestHandler>
     */
    public static Predicate<RequestHandler> basePackage(final String basePackage) {
        return input -> declaringClass(input).transform(handlerPackage(basePackage)).or(true);
    }

    private static Function<Class<?>, Boolean> handlerPackage(final String basePackage)     {
        return input -> {
            // 循环判断匹配
            for (String strPackage : basePackage.split(splitor)) {
                boolean isMatch = input.getPackage().getName().startsWith(strPackage);
                if (isMatch) {
                    return true;
                }
            }
            return false;
        };
    }

    private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
        return Optional.fromNullable(input.declaringClass());
    }
    /**
     * 配置了Swagger 的Docket的bean实例,扫描接口的位置
     * .apis
     *   RequestHandlerSelectors 配置swagger扫描接口的方式
     *      basePackage() 指定要扫描哪些包
     *      any() 全部都扫描
     *      none() 全部不扫描
     *      withClassAnnotation() 扫描类上的注解 参数是一个注解的反射对象
     *      withMethodAnnotation() 扫描包上的注解
     * .paths
     *   PathSelectors 路径扫描接口
     *      ant 配置以xxx 开头的路径
     * @return
     */
    @Bean
    public Docket docket( ){

        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("SourceLay")
                .select()
                .apis(RequestHandlerSelectors.basePackage(
                        "com.example.demo.file.controller"
                ))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * 配置Swagger信息 apiinfo
     * @return
     */
    private ApiInfo apiInfo(){
        //配置作者信息
        Contact DEFAULT_CONTACT = new Contact("SourceLay", "https://github.com/", "");
        return  new ApiInfo(
                "SourceLay 的 Swagger API文档",
                "SourceLay",
                "v1.0",
                "",
                DEFAULT_CONTACT,
                "MIT",
                "https://mit-license.org/",
                new ArrayList());
    }

}
