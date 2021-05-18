# JavaEE
JavaEE文件管理模块

##mybatits-generator
* 需要修改resources/mybatis/mybatis-generotor.xml下的localpath为本地数据库驱动地址。
* 使用前需要ssh连接数据库。
* 直接生成了全部的数据表
##配置文件
* 配置文件目录：/src/main/resources\
* 数据库配置文件application.properties
	* # database
	* spring.datasource.url=
	* spring.datasource.username=
	* spring.datasource.password=
	* spring.jpa.hibernate.ddl-auto=
	* spring.datasource.driver-class-name=
	* # MyBatis Generator (MBG)
	* mbg.jdbc.url=
	* mbg.jdbc.username=
	* mbg.jdbc.password=
	* mbg.jdbc.driver-location=
	* mbg.jdbc.driver-class-name=
	* mbg.target-package.mapper=
	* mbg.target-package.domain=
	* mbg.target-project.java=
	* mbg.target-project.resources=
	* mbg.target-mapperXml=
* 腾讯云COS客户端配置文件CosConfig.xml
	* &lt;bean class="com.example.demo.file.CosConfig" id = "CosConfig" scope="singleton">
	* &lt;constructor-arg name="secretId" value=""/>
    * &lt;constructor-arg name="secretKey" value=""/>
    * &lt;constructor-arg name="bucketName" value=""/>
    * &lt;constructor-arg name="regionName" value=""/>
    * &lt;/bean>

##Status文档
运行顺利  0

对象不存在  4

未知错误  9

操作失败 100

​	更新信息失败  101

​	获取信息失败  102

添加文件失败  200

下载文件失败  300

​	文件下载超时  301

删除文件失败  400

文件删除失败  401

分享文件删除失败  402

权限错误   700

​	权限错误：文件为私密文件  701

​	权限错误：您未获得此文件权限   702

​	权限错误：您未拥有此文件的所有权  703

​	权限错误：密码错误  704

​	权限错误：账号余额不足  705

违法操作 800

​	存在不合规词汇  801













