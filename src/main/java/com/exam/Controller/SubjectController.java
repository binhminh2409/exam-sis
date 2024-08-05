package com.exam.Controller;

import com.exam.Dto.SubjectDto;
import com.exam.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subject/")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("all")
    public List<SubjectDto> findAll() {
        return subjectService.findAll();
    }
}
