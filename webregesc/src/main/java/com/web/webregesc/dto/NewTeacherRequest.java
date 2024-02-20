package com.web.webregesc.dto;

import java.math.BigDecimal;

import com.web.webregesc.models.StatusTeacher;
import com.web.webregesc.models.Teacher;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class NewTeacherRequest {
    
    @NotBlank
    @NotNull
    private String name;
    @DecimalMin(value = "0.0")
    @NotNull
    private BigDecimal remuneration;
    private StatusTeacher statusTeacher;

    public Teacher toteacher(){
        Teacher newTeacher = new Teacher();
        newTeacher.setName(name);
        newTeacher.setRemuneration(remuneration);
        newTeacher.setStatusTeacher(statusTeacher);
        return newTeacher;
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

}
