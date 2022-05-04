package BankaOrnegi_;

public class Customer {
	int id;
	String isim;
	CreditCrad kart;
	
	public Customer(int id,String isim) {
		this.id=id;
		this.isim=isim;
	}
	
	public Customer(int id,String isim,CreditCrad kart) {
		this(id,isim);
		//this.id=id;
		//this.isim=isim;
		this.kart=kart;		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public CreditCrad getKart() {
		return kart;
	}
	
	public void setKart(CreditCrad kart) {
		this.kart = kart;
	}
	
	

}
