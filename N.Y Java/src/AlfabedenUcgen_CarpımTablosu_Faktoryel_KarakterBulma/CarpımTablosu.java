package AlfabedenUcgen_Carp�mTablosu_Faktoryel_KarakterBulma;

import java.util.Scanner;

public class Carp�mTablosu {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Say� Girin:");
 
        int num = scanner.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    } 
}
