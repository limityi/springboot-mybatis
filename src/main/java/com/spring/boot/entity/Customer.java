package com.spring.boot.entity;

import javax.persistence.*;

/**
 * 客户实体
 * Created by XiongYi on 2018/06/25.
 */
@Entity
@Table(name="customer")
@Access(value = AccessType.FIELD)
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 128)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
