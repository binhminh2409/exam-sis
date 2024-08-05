package com.exam.service.impl;

import com.exam.Dto.StudentDto;
import com.exam.Entity.Student;
import com.exam.Repository.StudentRepository;
import com.exam.mapper.StudentMapper;
import com.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentDto> findAll() {
        return studentRepository.findAll().stream()
                .map(studentMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto create(StudentDto studentDto) {
        Student inputEntity = studentMapper.dtoToEntity(studentDto);
        Student savedEntity = studentRepository.save(inputEntity);
        return studentMapper.entityToDto(savedEntity);
    }
}
