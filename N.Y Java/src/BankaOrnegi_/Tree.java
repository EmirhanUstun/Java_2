package BankaOrnegi_;

public class Tree {
	String tip;
	float yukseklik;
	
	public Tree() {
		tip="Me�e";
		yukseklik=12.5f;
		//System.out.println("Kurucu i�erisinden:");
		//printInfo();
	}
	
	void printInfo() {
		System.out.println("A�a� �zellikleri  ");
		System.out.println("Tip : " + tip);
		System.out.println("Y�kseklik : " + yukseklik);
	}
	
	public static void main(String[] args) {
		Tree agac=new Tree();
		agac.printInfo(); //Nesen durumu anlams�z.
		
		agac.tip="�am";
	    agac.yukseklik=5.2f;
	    agac.printInfo(); //Nesne durumu anlaml�
	    
	    Tree agac2=new Tree();
	    agac2.printInfo();
	}
	

}
