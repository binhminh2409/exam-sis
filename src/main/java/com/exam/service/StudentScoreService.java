package com.exam.service;

import com.exam.Dto.StudentDto;
import com.exam.Dto.StudentScoreDto;

import java.util.List;

public interface StudentScoreService {
    List<StudentScoreDto> findAll();
    StudentScoreDto create(StudentScoreDto StudentScoreDto);
}
