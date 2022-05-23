package com.borisov.data;

import com.borisov.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsRepository extends JpaRepository<Message, Long> {
}
