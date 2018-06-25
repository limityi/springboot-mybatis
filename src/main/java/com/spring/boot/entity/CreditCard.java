package com.spring.boot.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 信用卡实体
 * Created by XiongYi on 2018/06/25.
 */
@Entity
@Table(name="credit_card")
public class CreditCard {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 128)
    private String number;

    @Column
    private Date registerDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
