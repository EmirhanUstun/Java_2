package DortIslem_GetSet_Dizi;

public class DortIslemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DortIslem dortIslem=new DortIslem();	
		
		dortIslem.topla(3, 4);
		dortIslem.topla(3, 3, 6);
		int sonuc=dortIslem.carp(5, 6);
		
		System.out.println(sonuc);
		
	}

}
