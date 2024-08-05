package com.exam.Controller;

import com.exam.Dto.StudentDto;
import com.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("all")
    public List<StudentDto> findAll() {
        return studentService.findAll();
    }

    @PostMapping("create")
    public StudentDto create(@RequestBody StudentDto studentDto){
        return studentService.create(studentDto);
    }
}
