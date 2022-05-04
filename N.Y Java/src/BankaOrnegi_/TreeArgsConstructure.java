package BankaOrnegi_;

public class TreeArgsConstructure {
	String tip;
	float yukseklik;
	
	public TreeArgsConstructure() {
		
	}
	
	public TreeArgsConstructure(String yeniTip,float yeniYukseklik) {
		tip=yeniTip;
		yukseklik=yeniYukseklik;		
			
	}
	
	void printInfo() {
		System.out.println("Aðaç Özellikleri  ");
		System.out.println("Tip : " + tip);
		System.out.println("Yükseklik : " + yukseklik);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeArgsConstructure agac1=new TreeArgsConstructure("Meþe", 12.4f);
		agac1.printInfo();
		
		TreeArgsConstructure agac2=new TreeArgsConstructure("Çam", 5.4f);
		agac2.printInfo();
		
		TreeArgsConstructure agac3=new TreeArgsConstructure();
		agac3.tip="Ladin";
		agac3.yukseklik=3.5f;
		agac3.printInfo();
	}

}
