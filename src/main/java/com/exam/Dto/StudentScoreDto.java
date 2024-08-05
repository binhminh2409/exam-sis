package com.exam.Dto;

import com.exam.Entity.Subject;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentScoreDto {
    private long studentScoreId;
    private long studentId;
    private long subjectId;
    private BigDecimal score1;
    private BigDecimal score2;
}
