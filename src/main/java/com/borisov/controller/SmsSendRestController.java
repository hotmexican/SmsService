package com.borisov.controller;

import com.borisov.entity.Message;
import com.borisov.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class SmsSendRestController {
    private final SmsService service;

    @Autowired
    public SmsSendRestController(SmsService service) {
        this.service = service;
    }

    @PostMapping(value = "send", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean smsHandler(@RequestBody Message sms) {
        //по идее мне в @RequestBody приходит номер и текст, я только добавляю дату и статус для своей БД
        sms.setNumber("123456789");
        sms.setText("Пробное");
        sms.setSendTime(LocalDateTime.now());
        sms.setStatus(true);
        service.sendSms(sms);
        return sms.getStatus();
    }
}
