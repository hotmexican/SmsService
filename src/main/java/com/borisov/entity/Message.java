package com.borisov.entity;





import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;
    @Column(name = "number")
    private String number;
    @Column(name = "sendTime")
    private String sendTime;

    @Column(name = "status")
    private Boolean status;

    public Message(String text, String number) {
        this.text = text;
        this.number = number;
        this.sendTime = LocalDateTime.now().toString();
    }

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String expireTime) {
        this.sendTime = expireTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
