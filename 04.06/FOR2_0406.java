/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */
package BlocoUm;

import java.util.Scanner;

public class FOR2_0406 {

	public static void main(String[] args) {
		int num, par=0, impar=0;
		Scanner crocs = new Scanner(System.in);
		
		for(int i = 1;i<=10;i++)
		{
			System.out.print("Digite um n�mero: ");
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
		System.out.print("S�o "+par+" n�meros pares e "+impar+" n�meros �mpares.");

	}

}
