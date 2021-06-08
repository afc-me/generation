/*
 * Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.
 */
package BlocoUm;

import java.util.Scanner;

public class arrayVETOR2_0706 {

	public static void main(String[] args) {
		
		int par = 0, impar=0;
		int [] num = new int [6];
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<num.length;i++)
		{
			System.out.print("Digite um número: ");
			num[i] = leia.nextInt();
			
			if(num[i]%2==0)
			{
				par += num[i];
			}
			else
			{
				impar++;
			}
		}
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.print("\nO número "+num[i]+" é par");
			}
			else
			{
				System.out.print("\nO número "+num[i]+" é ímpar");
			}
			
		}
		
		
		System.out.print("\nA soma dos números pares digitados é: "+par);
		System.out.print("\nA quantidade de números impares digitados é: "+impar);

	}

}
