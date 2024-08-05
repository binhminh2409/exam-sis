package com.exam.mapper;

import com.exam.Dto.StudentDto;
import com.exam.Entity.Student;

public interface StudentMapper {
    StudentDto entityToDto (Student entity);
    Student dtoToEntity (StudentDto dto);
}
