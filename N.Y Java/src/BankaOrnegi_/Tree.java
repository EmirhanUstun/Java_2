package BankaOrnegi_;

public class Tree {
	String tip;
	float yukseklik;
	
	public Tree() {
		tip="Meþe";
		yukseklik=12.5f;
		//System.out.println("Kurucu içerisinden:");
		//printInfo();
	}
	
	void printInfo() {
		System.out.println("Aðaç Özellikleri  ");
		System.out.println("Tip : " + tip);
		System.out.println("Yükseklik : " + yukseklik);
	}
	
	public static void main(String[] args) {
		Tree agac=new Tree();
		agac.printInfo(); //Nesen durumu anlamsýz.
		
		agac.tip="Çam";
	    agac.yukseklik=5.2f;
	    agac.printInfo(); //Nesne durumu anlamlý
	    
	    Tree agac2=new Tree();
	    agac2.printInfo();
	}
	

}
