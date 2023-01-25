package com.salesken.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesken.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
