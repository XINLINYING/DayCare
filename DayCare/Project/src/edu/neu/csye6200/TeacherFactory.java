package edu.neu.csye6200;

public class TeacherFactory extends PersonFactory{

    @Override
    public Person getObject() {
        return new Teacher();
    }
}
