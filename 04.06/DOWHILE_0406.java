/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */
package BlocoUm;

import java.util.Scanner;

public class DOWHILE_0406 {

	public static void main(String[] args) {
		int num, soma = 0;
		Scanner gato = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = gato.nextInt();
		
		do
		{
			soma += num;
			System.out.print("Digite um número");
			num = gato.nextInt();
			
		}while (num!=0);
		
		System.out.print("A soma dos números digitados é: "+soma);
			
	}

}
