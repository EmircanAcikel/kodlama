package kodlama;

public class Student extends User {

	String joinedCourse;
	String endedCourse;
	String continuingCourse;
	
	public Student() {
		
	}
	
	public Student(String joinedCourse, String endedCourse, String continuingCourse) {
		super();
		this.joinedCourse = joinedCourse;
		this.endedCourse = endedCourse;
		this.continuingCourse = continuingCourse;
	}

	public String getJoinedCourse() {
		return joinedCourse;
	}

	public void setJoinedCourse(String joinedCourse) {
		this.joinedCourse = joinedCourse;
	}

	public String getEndedCourse() {
		return endedCourse;
	}

	public void setEndedCourse(String endedCourse) {
		this.endedCourse = endedCourse;
	}

	public String getContinuingCourse() {
		return continuingCourse;
	}

	public void setContinuingCourse(String continuingCourse) {
		this.continuingCourse = continuingCourse;
	}
	
	
}
