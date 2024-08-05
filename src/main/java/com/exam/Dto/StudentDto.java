package com.exam.Dto;

import com.exam.Entity.StudentScore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto {
    private long studentId;
    private String studentCode;
    private String fullName;
    private String address;
    private List<StudentScoreDto> studentScores;
}

