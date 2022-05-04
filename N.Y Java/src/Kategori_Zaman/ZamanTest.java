package Kategori_Zaman;

public class ZamanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Zaman zaman= new Zaman();
        
        zaman.saatIlerlet();
        
        System.out.println("Saat:" +zaman.saat+ 
        		" Dakika:" +zaman.dakika+ 
        		" Saniye:" +zaman.saniye);
	}

}
