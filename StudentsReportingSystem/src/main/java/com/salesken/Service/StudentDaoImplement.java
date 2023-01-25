package com.salesken.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesken.Exception.StudentException;
import com.salesken.Model.Reports;
import com.salesken.Model.Student;
import com.salesken.Repositery.StudentRepo;


@Service
public class StudentDaoImplement implements StudentDao {
	
	
	@Autowired
	private StudentRepo studentRepo;
	

	@Override
	public Student addStudentWithMarks(Student student) throws StudentException {
		return studentRepo.save(student);
	}


	@Override
	public Reports seeReports() throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
