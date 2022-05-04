package DortIslem_GetSet_Dizi;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		
		user.setAd("Serhat");
		user.setSoyad("Çanlýöz");
		user.setNumara(12);
		user.setYas(32);
        user.setAktiflik(true);
        
        System.out.println("Ad Soyad: " + user.getAd()+ " " + user.getSoyad());
	}

}
