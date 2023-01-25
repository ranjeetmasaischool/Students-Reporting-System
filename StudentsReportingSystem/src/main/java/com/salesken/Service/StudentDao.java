package com.salesken.Service;

import com.salesken.Exception.StudentException;
import com.salesken.Model.Reports;
import com.salesken.Model.Student;

public interface StudentDao {
	
	public Student addStudentWithMarks(Student student)throws StudentException;
	public Reports seeReports()throws StudentException;
	

}
