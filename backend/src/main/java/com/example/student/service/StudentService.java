package com.example.student.service;
import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
 private final StudentRepository repo;
 public StudentService(StudentRepository repo){ this.repo=repo;}
 public Student addStudent(Student s){ return repo.save(s);}
 public List<Student> getAllStudents(){ return repo.findAll();}
 public Student updateStudent(Long id, Student s){ s.setId(id); return repo.save(s);}
 public void deleteStudent(Long id){ repo.deleteById(id);}
}