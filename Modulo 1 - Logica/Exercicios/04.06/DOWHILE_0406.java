/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
package BlocoUm;

import java.util.Scanner;

public class DOWHILE_0406 {

	public static void main(String[] args) {
		int num, soma = 0;
		Scanner gato = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		num = gato.nextInt();
		
		do
		{
			soma += num;
			System.out.print("Digite um n�mero");
			num = gato.nextInt();
			
		}while (num!=0);
		
		System.out.print("A soma dos n�meros digitados �: "+soma);
			
	}

}
