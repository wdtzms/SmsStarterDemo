package com.example.startdemo.controller;


import com.sms.service.SmsSender;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class DemoController {
    @Resource(name = "tencentSmsSender")
    public SmsSender tencentSmsSender;

    @Resource(name = "aliYunSmsSender")
    public SmsSender aliYunSmsSender;

    @GetMapping("/tx")
    public String sendTencent() {
        return tencentSmsSender.send("给您发了一张优惠券");
    }

    @GetMapping("/al")
    public String sendAliyun() {
        return aliYunSmsSender.send("给您发了一张抵用券");
    }
}
