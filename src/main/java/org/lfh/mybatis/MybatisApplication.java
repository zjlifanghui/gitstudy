package org.lfh.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
        System.out.println("dev 分支的代码测试");

        System.out.println("这是主分支冲突");

        System.out.println("冲突测试");
    }

}
