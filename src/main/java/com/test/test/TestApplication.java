package com.test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    /**
     * git测试1
     */
    public void test1(){

    }

    /**
     * git测试 2
     */
    public void test2(){
        System.out.println("1");
    }

    /**
     * git测试 3
     */
    public void test3(){
        System.out.println("3");
    }

    /**
     * git测试 4
     */
    public void test4(){
        System.out.println("1");
        System.out.println("2");
    }

}
