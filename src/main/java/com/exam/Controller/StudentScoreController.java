package com.exam.Controller;

import com.exam.Dto.StudentScoreDto;
import com.exam.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student-score/")
public class StudentScoreController {
    @Autowired
    private StudentScoreService studentScoreService;

    @GetMapping("all")
    public List<StudentScoreDto> findAll() {
        return studentScoreService.findAll();
    }
}
