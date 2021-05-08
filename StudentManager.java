package kodlama;

public class StudentManager{

public void add(Student student) {
		
		System.out.println("Öðrenci eklendi : " + student.firstName);
		
	}
	
	public void delete(Student student) {
		
		System.out.println("Kullanýcý silindi : " + student.firstName);
		
	}
	
	public void update (Student student) {
		
		System.out.println("Kullanýcý güncellendi : " + student.firstName);
		
	}
	
}
