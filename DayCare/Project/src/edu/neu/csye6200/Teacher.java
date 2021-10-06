package edu.neu.csye6200;


public class Teacher extends Person {

	private int teacherId;
	private int classroomId;
	private int groupId;

    public Teacher() {

    }

	public int getHireddate() {
		return hireddate;
	}

	public void setHireddate(int hireddate) {
		this.hireddate = hireddate;
	}

	private int hireddate;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;

	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public Teacher(String firstName, String lastName, int age) {
		super(firstName, lastName, age);

	}


	public Teacher(int teacherId,  String firstName, String lastName, int age, int hireddate) {

		super(firstName, lastName, age);
		this.teacherId = teacherId;
		this.hireddate= hireddate;
	}


	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherId + "]";
	}


}
