package AlfabedenUcgen_CarpýmTablosu_Faktoryel_KarakterBulma;

public class KarakterBulma {

	public static void main(String[] args) {

		String input = "programmer";
		
		char search = 'm';
		
		int count = 0;
		
		for (int i = 0 ;i < input.length(); i++) {
			if(input.charAt(i) ==  search) {
				count++;
			}
			
		}
		System.out.println("Tekrar eden karakter sayýsý: " + count);
		
	}

}
