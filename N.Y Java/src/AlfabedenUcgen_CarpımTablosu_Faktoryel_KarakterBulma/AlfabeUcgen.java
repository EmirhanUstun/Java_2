package AlfabedenUcgen_CarpýmTablosu_Faktoryel_KarakterBulma;

import java.util.Scanner;

public class AlfabeUcgen {

	public static void main(String[] args) {

		for(int i = 0; i <= 5; i++) {
			int alphabet = 65;
			int temp = i;
			
			for (int j = i; j >= 0; j--) {
				System.out.print((char) (alphabet + temp) + " ");
				temp = temp + 5;
			}
			
			System.out.println();
		}
		
	}

}
