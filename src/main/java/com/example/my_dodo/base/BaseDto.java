package com.example.my_dodo.base;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Setter
@Getter
public abstract class BaseDto {
    protected Long id;
    protected Date addDate;
    protected Date updateDate;
    protected boolean active;
}
