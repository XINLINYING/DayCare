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
public class TeacherList {
//	private List<Teacher> teacherList = new ArrayList<>();
	private List<Teacher> teacherList = new ArrayList<>();
	
	public void addPersonToList(Teacher p) {
		this.teacherList.add(p);		
	}	

	public List<Teacher> getPersonList() {
		return teacherList;
	}

	public List<Teacher> generateAndGetList() {
	    String fileName = "teacherCSV.csv";
	    File file = new File(fileName);
	    BufferedReader reader = null;
	    try {
//	        System.out.println("Read file, once a line.");
	        reader = new BufferedReader(new FileReader(file));
	        String tempString = null;
	        int line = 1;
	        // Read file, once a line, until null
	        while ((tempString = reader.readLine()) != null) {
	        	String[] tempTeacher = tempString.split(",");
	        	int teacherId = Integer.parseInt(tempTeacher[0]);
	        	String firstName = tempTeacher[1];
	        	String lastName = tempTeacher[2];
	        	int age = Integer.parseInt(tempTeacher[3]);
                int hireDate = Integer.parseInt(tempTeacher[5]);
	        	this.teacherList.add(new Teacher(teacherId, firstName, lastName, age, hireDate));
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
		return teacherList;
	}
	
	
//	private static List<Person> teacherList = new ArrayList<>();
//	
//	
////    public TeacherList(){
////        teacherList = new ArrayList<Person>();
////    }
//    public TeacherList(){
//        teacherList = new ArrayList<Teacher>();
//    }
////    
////    public List<Person> getTeacherList() {
////        return teacherList;
////    }
//
//	@Override
//	public List<Person> getPersonList() {
//		return null;
//	}
//
////	@Override
////	public void setPersonList(List<Person> personList) {
////		// TODO Auto-generated method stub
////        String fileName = "teacherCSV.csv";
////        File file = new File(fileName);
////        BufferedReader reader = null;
////        try {
////            System.out.println("Read file, once a line.");
////            reader = new BufferedReader(new FileReader(file));
////            String tempString = null;
////            int line = 1;
////            // Read file, once a line, until null
////            while ((tempString = reader.readLine()) != null) {
////            	String[] tempTeacher = tempString.split(",");
////            	int teacherId = Integer.parseInt(tempTeacher[0]);
////            	String firstName = tempTeacher[1];
////            	String lastName = tempTeacher[2];
////            	int age = Integer.parseInt(tempTeacher[3]);
////            	this.teacherList.add(new Teacher(teacherId, firstName, lastName, age));
//////                // show line number
//////                System.out.println("line " + line + ": " + tempString);
//////                line++;
////            }
////            reader.close();
////        } catch (IOException e) {
////            e.printStackTrace();
////        } finally {
////            if (reader != null) {
////                try {
////                    reader.close();
////                } catch (IOException e1) {
////                }
////            }
////        }
////    		
////	}
//
//	@Override
//	public void addPersonToList(Person p) {
//		this.teacherList.add(p);
//		
//	}
//
//	@Override
//	public void generatePersonList() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Person> generateAndGetList() {
//		// TODO Auto-generated method stub
//      String fileName = "teacherCSV.csv";
//      File file = new File(fileName);
//      BufferedReader reader = null;
//      try {
//          System.out.println("Read file, once a line.");
//          reader = new BufferedReader(new FileReader(file));
//          String tempString = null;
//          int line = 1;
//          // Read file, once a line, until null
//          while ((tempString = reader.readLine()) != null) {
//          	String[] tempTeacher = tempString.split(",");
//          	int teacherId = Integer.parseInt(tempTeacher[0]);
//          	String firstName = tempTeacher[1];
//          	String lastName = tempTeacher[2];
//          	int age = Integer.parseInt(tempTeacher[3]);
//          	this.teacherList.add(new Teacher(teacherId, firstName, lastName, age));
////              // show line number
////              System.out.println("line " + line + ": " + tempString);
////              line++;
//          }
//          reader.close();
//      } catch (IOException e) {
//          e.printStackTrace();
//      } finally {
//          if (reader != null) {
//              try {
//                  reader.close();
//              } catch (IOException e1) {
//              }
//          }
//      }
//		return this.teacherList;
//	}

//    public Teacher addTeacher() {
//        Teacher t = new Teacher();
//        teacherList.add(t);
//        return t;
//    }
//    
//    public void removeTeacher(Teacher t) {
//        teacherList.remove(t);
//    }    
}
