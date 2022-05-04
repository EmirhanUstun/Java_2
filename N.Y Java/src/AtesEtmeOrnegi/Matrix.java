package AtesEtmeOrnegi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Matrix {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			
	      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	      
	      System.out.println("Dizi boyutunu giriniz : ");
	      
	      int n = Integer.parseInt(reader.readLine().trim());
	      
	      int [][] arry = new int [n][n];
	      
	      System.out.println("Diziyi giriniz : ");
	      
	      for(int i = 0; i < n; i++) {
	    	  String[] rowTemp = reader.readLine().split(" ");
	    	  
	    	  for(int j = 0; j < n; j++) {
	    		  arry[i][i] = Integer.parseInt(rowTemp[j]); 
	    	  }
	      }
	      
	      int result = diagonalToplam(arry);
	      
	      System.out.println("Diagonal toplam : " + result);
	      
	      reader.close();
	      	        	      
	}
	
	private static int diagonalToplam(int[][] arry) {
		
		int diagonalToplam = 0;
		
		for(int i = 0; i < arry.length; i++) {
			for(int j = 0; j < arry.length; j++) {
				if(i == j) {
					diagonalToplam += arry[i][j];
				}
				}
			}
		return diagonalToplam;
	}
	
}
