/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
package BlocoUm;

import java.util.Scanner;

public class arrayMATRIZ1_0706 {

	public static void main(String[] args) {
		int[][] num = new int [3][3];
		int maior= 0;
		Scanner honne = new Scanner(System.in);
		
		for(int l=0;l<num.length;l++)
		{
			for(int c=0;c<num.length;c++)
			{
				System.out.println("\nEntre com o valor: ");
				num[l][c] = honne.nextInt();
				
				if(num[l][c]>10)
				{
					maior++;
				}
				
			}
		}
		System.out.println("\nA matriz tem "+maior+" valores maior do que 10");
		


	}

}
