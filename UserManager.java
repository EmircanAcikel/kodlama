package kodlama;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println("Kullanıcı eklendi : " + user);
		
	}
	
	public void delete(User user) {
		
		System.out.println("Kullanıcı silindi : " + user);
		
	}
	
	public void update (User user) {
		
		System.out.println("Kullanıcı güncellendi : " + user);
		
	}

}
