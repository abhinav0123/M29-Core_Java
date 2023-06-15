package org.tnsif.repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.tnsif.dao.StudentDao;
import org.tnsif.entities.Student;
public class StudentRepoImpl implements StudentRepo{
	
	//object creation for DAO layer
	StudentDao dao;
	//default constructor
	public StudentRepoImpl() {
		dao=new StudentDao();
	}

	@Override
	public Statement makeStatement() {
		Connection connection=dao.createConnection();
		Statement statement;
		try {
		statement=connection.createStatement();
		}
		catch(SQLException e)
		{
			statement=null;
			System.out.println(e);
		}
		return statement;
	}

	@Override
	public PreparedStatement createPrepareStatement(String query) {
		Connection connection=dao.createConnection();
		PreparedStatement statement;
		try {
		statement=connection.prepareStatement(query);
		}
		catch(SQLException e)
		{
			statement=null;
			System.out.println(e);
		}
		return statement;
	}

	@Override
	public int addQuery(String query, Student student) {
		PreparedStatement statement=createPrepareStatement(query);
		int count=0;
		try {
			statement.setInt(1,student.getRollno());
			statement.setString(2,student.getName());
			count=statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Undefined data");
		}
		return count;
	}

	@Override
	public int updateQuery(String query, Student student) {
		PreparedStatement statement=createPrepareStatement(query);
		int count=0;
		try {
			statement.setInt(2,student.getRollno());
			statement.setString(1,student.getName());
			count=statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Undefined data");
		}
		return count;
	}
	

	@Override
	public int deleteQuery(String query) {
		Statement statement=makeStatement();
		int count;
		try {
		count=statement.executeUpdate(query);
		}
		catch(SQLException e)
		{
			count=0;
			System.out.println("There is no any row to delete");
		}
		return count;
	}

	@Override
	public ResultSet retrieveQuery(String query) {
		Statement statement=makeStatement();
		ResultSet rs;
		try {
		rs=statement.executeQuery(query);
		}
		catch(SQLException e)
		{
			rs=null;
		}

		return rs;
	}

}