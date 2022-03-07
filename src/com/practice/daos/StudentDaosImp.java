package com.practice.daos;

import java.sql.Connection;

import java.sql.PreparedStatement;
import com.practice.entity.Student;
import com.practice.util.DBConnecton;

public class StudentDaosImp {
   public static boolean insertStudentToDB(Student st) {
	   boolean flag=false;
	   try {
		   Connection con= DBConnecton.createConnection();
		   String q="insert into students(sname,sphone,scity,sage) values(?,?,?,?)";
		   PreparedStatement pst=con.prepareStatement(q);
		   
		   pst.setString(1, st.getStudentName());
		   pst.setString(2, st.getStudentPhone());
		   pst.setString(3, st.getStudentCity());
		   pst.setInt(4, st.getStudentAge());
		   
		   pst.executeUpdate();
		   flag=true;
		
	} catch (Exception e) {
		// TODO: handle exception]
		e.printStackTrace();
	}
	 return flag;
   }
}
