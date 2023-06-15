package org.tnsif.repository;
//program to demonstrate on CRUD operation
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.tnsif.entities.Student;
public interface StudentRepo {
	/*The Statement object used for executing a static 
	 * SQL statementand returning the results it produces. 
	 */
	Statement makeStatement();
	PreparedStatement createPrepareStatement(String query);
	public int addQuery(String query,Student student);
	public int updateQuery(String query,Student student);
	public int deleteQuery(String query);
	public ResultSet retrieveQuery(String query);


	

}