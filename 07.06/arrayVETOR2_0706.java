/*
 * Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.
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
			System.out.print("Digite um n�mero: ");
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
				System.out.print("\nO n�mero "+num[i]+" � par");
			}
			else
			{
				System.out.print("\nO n�mero "+num[i]+" � �mpar");
			}
			
		}
		
		
		System.out.print("\nA soma dos n�meros pares digitados �: "+par);
		System.out.print("\nA quantidade de n�meros impares digitados �: "+impar);

	}

}
