package kodlama;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.userName = "emircanacikel";
		student.firstName="Emircan";
		student.lastName="AÇIKEL";
		student.email="acikelemircan@gmail.com";
		student.password="165484cswevwsv";
		student.endedCourse="C#, Python";
		student.joinedCourse="C#, Python, Java";
		student.continuingCourse="Java";
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
	}

}
