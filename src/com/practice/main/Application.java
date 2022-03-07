package com.practice.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.practice.daos.StudentDaosImp;
import com.practice.entity.Student;

public class Application {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
        System.out.print("***Welcome***\nHello from jdbc");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	System.out.println("1)To add Student.\n2)To delete Student.\n3)Display Student.\n4)Update Student/\n5)Exit.");
        	System.out.println("\nEnter your choice:");
        	int c=Integer.parseInt(br.readLine());
        	
        	
        	if(c==1) {
        		//add student
        		System.out.println("Enter student name");
        		String name= br.readLine();
        		
        		System.out.println("Enter student phone");
        		String phone= br.readLine();
        		
        		System.out.println("Enter student city");
        		String city= br.readLine();

        		System.out.println("Enter student age");
        		int age= Integer.parseInt(br.readLine());
        		
        		
        		//student object to store student
        		Student st = new Student(name,phone, city,age);
        		boolean ans=StudentDaosImp.insertStudentToDB(st);
        		if(ans) {
        			System.out.println("1 Student added...");
            		System.out.println(st);
        		} else {
        			System.out.println("Error! While inserting..");
        		}
        		
        		
        	}else if(c==2) {
        		
        	}else if(c==3) {
        		
         	}else if(c==4) {
         		
         	}else if(c==5) {
         		break;
         	}
        }
        System.out.println("Thank you for using the application..");
	}

}
