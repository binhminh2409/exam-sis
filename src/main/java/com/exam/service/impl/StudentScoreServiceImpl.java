package com.exam.service.impl;

import com.exam.Dto.StudentDto;
import com.exam.Dto.StudentScoreDto;
import com.exam.Entity.Student;
import com.exam.Entity.StudentScore;
import com.exam.Repository.StudentScoreRepository;
import com.exam.mapper.StudentScoreMapper;
import com.exam.service.StudentScoreService;
import com.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class StudentScoreServiceImpl implements StudentScoreService {
    @Autowired
    StudentScoreRepository studentScoreRepository;

    @Autowired
    StudentScoreMapper studentScoreMapper;

    @Override
    public List<StudentScoreDto> findAll() {
        return studentScoreRepository.findAll().stream()
                .map(studentScoreMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public StudentScoreDto create(StudentScoreDto StudentScoreDto) {
        StudentScore inputEntity = studentScoreMapper.dtoToEntity(StudentScoreDto);
        StudentScore savedEntity = studentScoreRepository.save(inputEntity);
        return studentScoreMapper.entityToDto(savedEntity);
    }

}
