package com.borisov.service;

import com.borisov.data.SmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    private final SmsRepository smsRepository;
    @Autowired
    public SmsService(SmsRepository smsRepository) {
        this.smsRepository = smsRepository;
    }

}
