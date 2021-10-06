/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JiayingXie
 */
public class StudentList {
	private List<Student> studentList = new ArrayList<>();
	
	public void addPersonToList(Student p) {
		this.studentList.add(p);		
	}	

	public List<Student> getPersonList() {
		return studentList;
	}

	public List<Student> generateAndGetList() {
	    String fileName = "studentCSV.csv";
	    File file = new File(fileName);
	    BufferedReader reader = null;
	    try {
	        System.out.println("Read file, once a line.");
	        reader = new BufferedReader(new FileReader(file));
	        String tempString = null;
	        int line = 1;
	        // Read file, once a line, until null
	        while ((tempString = reader.readLine()) != null) {
	        	String[] tempStudent = tempString.split(",");
	        	int studentId = Integer.parseInt(tempStudent[0]);
	        	int age = Integer.parseInt(tempStudent[1]);
	        	String studentFirstName = tempStudent[2];
	        	String studentLastName = tempStudent[3];
	        	String parentFirstName = tempStudent[4];
	        	String parentLastName = tempStudent[5];
	        	String address = tempStudent[6];
	        	String parentPhone = tempStudent[7];
	        	String vaccine = tempStudent[8];	        	
	        	this.studentList.add(new Student(studentId, age, studentFirstName, studentLastName, 
	        			parentFirstName, parentLastName, address, parentPhone, vaccine));
	        }
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e1) {
	            }
	        }
	    }				
		return studentList;
	}
}
