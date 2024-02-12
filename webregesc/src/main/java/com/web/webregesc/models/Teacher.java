package com.web.webregesc.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private BigDecimal remuneration;
    @Enumerated(EnumType.STRING)
    private StatusTeacher statusTeacher;
   
    public Teacher(String name, BigDecimal remuneration, StatusTeacher statusTeacher) {
        this.name = name;
        this.remuneration = remuneration;
        this.statusTeacher = statusTeacher;
    }

    public Teacher() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public BigDecimal getRemuneration() {
        return remuneration;
    }


    public void setRemuneration(BigDecimal remuneration) {
        this.remuneration = remuneration;
    }


    public StatusTeacher getStatusTeacher() {
        return statusTeacher;
    }


    public void setStatusTeacher(StatusTeacher statusTeacher) {
        this.statusTeacher = statusTeacher;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", remuneration=" + remuneration + ", statusTeacher="
                + statusTeacher + "]";
    }

    
    
}
