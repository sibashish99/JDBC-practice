package com.practice.daos;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;
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

   public static boolean deleteStudentToDB(int userId) {
	// TODO Auto-generated method stub
	   boolean flag=false;
	   try {
		   Connection con= DBConnecton.createConnection();
		   String q="delete from students where sid=?";
		   PreparedStatement pst=con.prepareStatement(q);
		   
		   pst.setInt(1, userId);
		 
		   
		   pst.executeUpdate();
		   flag=true;
		
	} catch (Exception e) {
		// TODO: handle exception]
		e.printStackTrace();
	}
	   return flag;
    }

    public static void showStudentToDB() {
	// TODO Auto-generated method stub
  	   try {
  		   Connection con= DBConnecton.createConnection();
  		   String q="select * from students";
  		   
		   @SuppressWarnings("rawtypes")
		   Statement stmt= (Statement) con.createStatement();
  		   
  		   ResultSet set=((java.sql.Statement) stmt).executeQuery(q);
  		   
  		   while(set.next()) {
  			   int id=set.getInt(1);
  			   String name=set.getString(2);
  			   String phone=set.getString(3);
  			   String city=set.getString(4);
  			   int age= set.getInt(5);
  			   
  			   System.out.println("Student name:"+name+" ID: "+id+" phone: "+phone+" city: "+" age: "+age+"\n");
  			   
  		   }
  		
  	} catch (Exception e) {
  		// TODO: handle exception]
  		e.printStackTrace();
  	 }
  	  
     }
   
   
}
