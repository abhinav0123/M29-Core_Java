//driver class
//program to demonstrate on CRUD operation USING JDBC
package org.tnsif.client;
import java.util.Scanner;
import org.tnsif.entities.Student;
import org.tnsif.service.StudentService;
import org.tnsif.service.StudentServiceImpl;
public class Client {

	public static void main(String[] args) {
		int choice;
		StudentService service=new StudentServiceImpl();
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("Enter the choice: "
					+"\n 1: Retrive with specific student"
					+"\n 2: Retrive all"
					+"\n 3. delete"
					+"\n 4: insert"
					+"\n 5. update"
					+"\n -1: exit");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the rollno:");
				Student student;
				try {
				student=service.getStudent(s.nextInt());
				}
				catch(Exception e)
				{
					student=null;
				}
				if(student!=null)
				{
					System.out.println(student);
				}
				else
				{
					System.out.println("data not found");
				}
			}
		
			break;
				
			case 3:
			{
				System.out.println("Enter the rollno for delete");
				boolean result=service.deleteStudent(s.nextInt());
				if(result)
					System.out.println("deleted ");
				else
					System.out.println("details not found");
			}
			break;
			case 4:
			{
				System.out.println("enter the details of student:");
				Student student=new Student(s.nextInt(),s.next());
				if(service.addStudent(student))
					System.out.println("added");
				else
					System.out.println("details not found");
				
			}
			break;
			case 5:
			{
				System.out.println("enter the rollno for you"
						+"want to update a data");
				Student student=new Student();
				student.setRollno(s.nextInt());
				System.out.println("Enter the updated details");
				s.nextLine();
				student.setName(s.nextLine());
				Student s1=service.updateStudent(student);
				if(s1!=null)
					System.out.println("updated");
				else
					System.out.println("student not found");

			}
			break;
			case -1:
			{
				System.out.println("Thank you!");
			}
			break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}while(choice>0);
	}
}

