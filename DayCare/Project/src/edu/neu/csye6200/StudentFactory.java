package edu.neu.csye6200;

public class StudentFactory extends PersonFactory{

	//@Override
	public Person getObject() {
		// TODO Auto-generated method stub
		return new Student();
	}

}
