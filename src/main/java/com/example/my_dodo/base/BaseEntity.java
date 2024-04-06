package com.example.my_dodo.base;


import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Data;

import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    protected Date addDate;
    protected Date updateDate;
    protected boolean active;

    @PrePersist
    protected void onreate(){
        addDate=new Date();
    }
}
