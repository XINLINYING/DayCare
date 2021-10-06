package edu.neu.csye6200;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int personID;
    private String name;
    private String pwd = "000000";

    public Person(String firstName, String lastName, int age) {
        super();
        this.setFirstName(firstName);
        this.lastName = lastName;
        this.age = age;
    }

	public Person() {

	}

	public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    //@Override
    public int getAge() {
        return age;
    }

    //@Override
    public void setAge(int age) {
        this.age = age;
    }

    //@Override
    public String getFirstName() {
        return firstName;
    }

    //@Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    //@Override
    public String getLastName() {
        return lastName;
    }


    //@Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }


}
