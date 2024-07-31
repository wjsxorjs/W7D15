package com.sist.jpa_ex2.store;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "emp")
@Getter
@Setter
public class Emp {
    @Id
    @Column(name = "empno")
    private String empno;
    @Column(name = "ename")
    private String ename;

}