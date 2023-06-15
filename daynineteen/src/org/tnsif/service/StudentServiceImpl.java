package org.tnsif.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.tnsif.entities.Student;
import org.tnsif.repository.StudentRepo;
import org.tnsif.repository.StudentRepoImpl;
public class StudentServiceImpl implements StudentService{

	@Override
	public boolean addStudent(Student student) {
		String query="INSERT INTO STUDENT VALUES(?,?)";
		StudentRepo repo=new StudentRepoImpl();
		int count=repo.addQuery(query, student);
		if(count==1)
			return true;
		else
			return false;
	}

	@Override
	public Student getStudent(int rollno) {
		Student student=new Student();
		StudentRepo repo=new StudentRepoImpl();
		String query="SELECT * FROM STUDENT WHERE rollno= "+rollno;
		ResultSet rs=repo.retrieveQuery(query);
		try {
			rs.next();
			student.setRollno(rs.getInt(1));
			student.setName(rs.getString(2));
		} catch (SQLException e) {
			System.out.println(e);
		}
		return student;
	}

	@Override
	public List<Student> getAll() {
		List<Student> students=new ArrayList<Student>();
		StudentRepo repo=new StudentRepoImpl();
		String query="SELECT * FROM STUDENT";
		ResultSet rs=repo.retrieveQuery(query);
		try {
			while(rs.next()) {
				Student student=new Student();
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				students.add(student);
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		return students;
	}

	@Override
	public Student updateStudent(Student student) {
		String query="UPDATE STUDENT SET name= ? WHERE (rollno= ?)";
		StudentRepo repo=new StudentRepoImpl();
		int count=repo.updateQuery(query, student);
		if(count==1) {
			Student s=getStudent(student.getRollno());
			return s;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteStudent(int rollno) {
		String query="DELETE FROM STUDENT WHERE rollno= "+rollno;
		StudentRepo repo=new StudentRepoImpl();
		int count=repo.deleteQuery(query);
		if(count==1)
			return true;
		else
			return false;
	}

}