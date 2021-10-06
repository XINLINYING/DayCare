package edu.neu.csye6200;

public class ManagerFactory extends PersonFactory {

    @Override
    public Manager getObject() {
        return new Manager();
    }
}
