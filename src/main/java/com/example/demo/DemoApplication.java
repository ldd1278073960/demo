package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

    public static void main(String[] args) {
        String str = ",1,2,3,";
        String[] split = str.split(str);
        for (String s : split) {
            System.out.println(s);
        }
    }
}
