package com.borisov.service;

import com.borisov.data.SmsRepository;
import com.borisov.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    private final SmsRepository smsRepository;
    @Autowired
    public SmsService(SmsRepository smsRepository) {
        this.smsRepository = smsRepository;
    }

    public void sendSms(Message message){
        smsRepository.save(message);
    }
}
