package com.exam.service;

import com.exam.Dto.StudentDto;
import com.exam.Entity.Student;
import com.exam.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
    StudentDto create(StudentDto studentDto);
}
