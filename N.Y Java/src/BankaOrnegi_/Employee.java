package BankaOrnegi_;

public class Employee {
	int id;
	String ad,soyad,bolum;
	float maas;
	
    //public Employee(int yeniId,float yeniMaas,String yeniAd,String yeniSoyad) {
    //  id=yeniId;
    //  ad=yeniAd;
    //  soyad=yeniSoyad;
	//  maas=yeniMaas;			   		
	//}
   
   public Employee(int Id,float Maas,String Ad,String Soyad) {
	   this.id=id;
	   this.ad=ad;
	   this.soyad=soyad;
	   this.maas=maas;			   		
	}

   public Employee(int yeniId,float yeniMaas,String yeniAd,String yeniSoyad,String yeniBolum) {
	   this(yeniId,yeniMaas,yeniAd,yeniSoyad);
	   //id=yeniId;
	   //ad=yeniAd;
	   //soyad=yeniSoyad;
	   //maas=yeniMaas;	
	   bolum=yeniBolum;	
}
   
   public static void main(String[] args) {
	   
	   Employee �sci=new Employee(1, 100f, "Serhat", "�anl��z", "Bolum1");
	   
	   	Employee �sci2=new Employee(2, 200f, "�nci", "�anl��z");
	   
   }



	

}
