package javaPrograms;

import java.util.Scanner;

public class WAPtoPrintStarPattern3 {

	/*
	      *
	    *   *
	  *    *   *
	*   *   *    *
	 */

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter first number : ");  
		int TotalNoOfRows= sc.nextInt();
		
		for(int row = 1; row <= TotalNoOfRows; row++) {
			for(int space = 1; space<=(TotalNoOfRows-row); space++){
				System.out.print(" ");
				
			}
			for(int symbol = 1; symbol<= ((2*row)-1); symbol++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		


	}

}
