package com.web.webregesc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.webregesc.models.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    
}
