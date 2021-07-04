package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> GetStudents(){
        return List.of(new Student(1l,"Mariam",
                        "mariam@gmail.com",
                        LocalDate.of(1997, Month.NOVEMBER,28),
                        23
                )
        );
    }
}
