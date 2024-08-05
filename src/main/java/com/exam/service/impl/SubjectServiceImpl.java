package com.exam.service.impl;

import com.exam.Dto.SubjectDto;
import com.exam.Entity.Subject;
import com.exam.Repository.SubjectRepository;
import com.exam.mapper.SubjectMapper;
import com.exam.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public List<SubjectDto> findAll() {
        return subjectRepository.findAll().stream()
                .map(subjectMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public SubjectDto create(SubjectDto studentDto) {
        Subject inputEntity = subjectMapper.dtoToEntity(studentDto);
        Subject savedEntity = subjectRepository.save(inputEntity);
        return subjectMapper.entityToDto(savedEntity);
    }
}
