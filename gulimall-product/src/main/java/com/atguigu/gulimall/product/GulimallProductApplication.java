package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-plus
 * 1.导入依赖
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.4.1</version>
 *         </dependency>
 * 2，配置
 *      1、配置数据源
 *          1、导入数据库驱动
 *          <dependency>
 *             <groupId>mysql</groupId>
 *             <artifactId>mysql-connector-java</artifactId>
 *             <version>8.0.23</version> 版本与数据库版本相同
 *         </dependency>
 *         2.在application.yml配置数据源相关信息
 *      2、配置mybatis-plus
 *          1.配置MapperScan
 *          2.告诉mybatis-plus sql映射文件在哪里（application.yml配置）
 *
 *      3.
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
