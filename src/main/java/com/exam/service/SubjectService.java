package com.exam.service;

import com.exam.Dto.SubjectDto;

import java.util.List;

public interface SubjectService {
    List<SubjectDto> findAll();
    SubjectDto create(SubjectDto subjectDto);
}
