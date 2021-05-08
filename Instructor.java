package kodlama;

public class Instructor extends User{

	String givenCourses;
	String resume;
	
	public Instructor() {
		
	}
	
	public Instructor(String givenCourses, String resume) {
		super();
		this.givenCourses = givenCourses;
		this.resume = resume;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
}
