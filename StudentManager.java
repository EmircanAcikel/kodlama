package kodlama;

public class StudentManager{

public void add(Student student) {
		
		System.out.println("��renci eklendi : " + student.firstName);
		
	}
	
	public void delete(Student student) {
		
		System.out.println("Kullan�c� silindi : " + student.firstName);
		
	}
	
	public void update (Student student) {
		
		System.out.println("Kullan�c� g�ncellendi : " + student.firstName);
		
	}
	
}
