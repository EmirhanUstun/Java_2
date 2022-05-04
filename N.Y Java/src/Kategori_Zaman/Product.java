package Kategori_Zaman;

import java.util.Locale.Category;

public class Product {

	public int id;
	String isim;
	double fiyat;
	Kategori_Zaman.Category kategori;
	public String name;
	
	String getInfo() {
		String info="Urun Id:"+id+" "+"Urun Adi:"+isim+"Urun Fiyat�:"+fiyat;
		
		if(kategori!=null) {
			info+=" Kategori ad� : " + kategori.name;
			
		}
		
		return info;
	}
	
}
