package AlfabedenUcgen_CarpýmTablosu_Faktoryel_KarakterBulma;

import java.util.Scanner;

public class CarpýmTablosu {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayý Girin:");
 
        int num = scanner.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    } 
}
