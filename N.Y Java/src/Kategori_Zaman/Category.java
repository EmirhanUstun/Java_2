package Kategori_Zaman;

public class Category {

	int id;
	String name;
	Product urun;
	
	String getInfo() {
		String info= "Kategori Id:" + id +" " + "Kategori Adi:" + name;
		
		if(urun!=null) {
			info+="Urun Adi: " + urun.isim + "Urun Fiyati: "+urun.fiyat;
		}
		
		return info;
	}
}
