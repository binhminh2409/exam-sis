package com.exam.mapper.impl;

import com.exam.Dto.StudentScoreDto;
import com.exam.Entity.StudentScore;
import com.exam.Repository.StudentRepository;
import com.exam.Repository.SubjectRepository;
import com.exam.mapper.StudentScoreMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentScoreMapperImpl implements StudentScoreMapper {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SubjectRepository subjectRepository;

    public StudentScoreDto entityToDto (StudentScore entity) {
        StudentScoreDto dto = new StudentScoreDto();
        BeanUtils.copyProperties(entity, dto);
        dto.setStudentId(entity.getStudent().getStudentId());
        dto.setSubjectId(entity.getSubject().getSubjectId());
        return dto;
    }

    public StudentScore dtoToEntity (StudentScoreDto dto) {
        StudentScore entity = new StudentScore();
        BeanUtils.copyProperties(dto, entity);
        entity.setStudent(studentRepository.findById(dto.getStudentId()).orElse(null));
        entity.setSubject(subjectRepository.findById(dto.getSubjectId()).orElse(null));
        return entity;
    }
}
