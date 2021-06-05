/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */
package BlocoUm;

import java.util.Scanner;

public class FOR2_0406 {

	public static void main(String[] args) {
		int num, par=0, impar=0;
		Scanner crocs = new Scanner(System.in);
		
		for(int i = 1;i<=10;i++)
		{
			System.out.print("Digite um número: ");
			num = crocs.nextInt();
			
			if(num%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.print("São "+par+" números pares e "+impar+" números ímpares.");

	}

}
