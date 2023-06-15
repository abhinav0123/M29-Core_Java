package org.tnsif.service;
import java.util.List;
import org.tnsif.entities.Student;
public interface StudentService {
	
	public boolean addStudent(Student student);//create
	public Student getStudent(int rollno);//retrive with specific id
	public List<Student>getAll();//reteive all the data
	public Student updateStudent(Student student);//update
	public boolean deleteStudent(int rollno);//delete

}
