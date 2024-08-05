package com.exam.mapper;

import com.exam.Dto.StudentScoreDto;
import com.exam.Entity.StudentScore;

public interface StudentScoreMapper {
    StudentScoreDto entityToDto (StudentScore entity);
    StudentScore dtoToEntity (StudentScoreDto dto);
}
