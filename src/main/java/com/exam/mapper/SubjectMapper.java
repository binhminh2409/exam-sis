package com.exam.mapper;

import com.exam.Dto.SubjectDto;
import com.exam.Entity.Subject;

public interface SubjectMapper {
    SubjectDto entityToDto (Subject entity);
    Subject dtoToEntity (SubjectDto dto);
}
