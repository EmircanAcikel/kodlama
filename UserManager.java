package kodlama;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println("Kullan�c� eklendi : " + user);
		
	}
	
	public void delete(User user) {
		
		System.out.println("Kullan�c� silindi : " + user);
		
	}
	
	public void update (User user) {
		
		System.out.println("Kullan�c� g�ncellendi : " + user);
		
	}

}
