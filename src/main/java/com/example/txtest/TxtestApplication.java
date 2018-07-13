package com.example.txtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mutouji
 */
@SpringBootApplication
@Controller
public class TxtestApplication {


    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TxtestApplication.class, args);
    }
}
