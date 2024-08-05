package com.exam.mapper.impl;

import com.exam.Dto.StudentDto;
import com.exam.Dto.StudentScoreDto;
import com.exam.Entity.Student;
import com.exam.mapper.StudentMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentMapperImpl implements StudentMapper {
    public StudentDto entityToDto (Student entity) {
        StudentDto dto = new StudentDto();
        BeanUtils.copyProperties(entity, dto);

        return dto;
    }

    public Student dtoToEntity (StudentDto dto) {
        Student entity = new Student();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}