package AlfabedenUcgen_Carp�mTablosu_Faktoryel_KarakterBulma;

import java.util.Scanner;

public class Faktoryel {

public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;
        
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
    }
}


/* Hocan�n yapt���
 * 
 * package ch7_tekrar;

   import java.util.Scanner;

   public class Faktoryel {

   public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        
        int n = scanner.nextInt();
        
         System.out.println("Girilen say�n�n fakt�riyeli: " + faktoryel(n);
         }
         
         private static int faktoryel(int n) {
            if(n == 1) {
            return 1;
            }
             return n * faktoryel(n-1)
        
        }
         
         
    }
 
 
 
 
 
 
 */
