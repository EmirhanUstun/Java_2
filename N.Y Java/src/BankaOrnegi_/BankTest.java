package BankaOrnegi_;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer musteri1=new Customer(1,"İnci");
		
		//CreditCrad kart=new CreditCrad("12121212",2000);
		//Customer musteri2=new Customer(2,"Serhat",kart);
		
		Customer musteri2=new Customer(2,"Serhat",new CreditCrad("123456789",1000));
		
		System.out.println("Musteri : " + musteri1.id+" " + musteri1.isim + " ");
		System.out.println("Musteri : " + musteri2.id+" " + musteri2.isim + " " + musteri2.kart.no);


	}

}
