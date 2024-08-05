package com.exam.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SubjectDto {
    private long subjectId;
    private String subjectCode;
    private String subjectName;
    private int credit;
}
