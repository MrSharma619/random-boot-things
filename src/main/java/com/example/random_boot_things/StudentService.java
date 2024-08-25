package com.example.random_boot_things;

import com.example.random_boot_things.exceptions.NoStudentsException;
import com.example.random_boot_things.exceptions.StudentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        throw new NoStudentsException("No students have registered yet.");
    }

    public Student findById(int id){
        throw new StudentNotFoundException("Student not found with id: " + id);
    }

}
