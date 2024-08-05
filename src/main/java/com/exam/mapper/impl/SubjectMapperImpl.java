package com.exam.mapper.impl;

import com.exam.Dto.SubjectDto;
import com.exam.Entity.Subject;
import com.exam.mapper.SubjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class SubjectMapperImpl implements SubjectMapper {
    public SubjectDto entityToDto (Subject entity) {
        SubjectDto dto = new SubjectDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public Subject dtoToEntity (SubjectDto dto) {
        Subject entity = new Subject();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
