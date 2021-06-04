/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */
package BlocoUm;

import java.util.Scanner;

public class ex4_0306 {

	public static void main(String[] args) {
		int num;
		double conta;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if (num%2==0)
		{
			conta = Math.sqrt(num);
			System.out.print("O número "+num+" é par e sua raiz quadrada é: "+conta);
		}
		else
		{
			conta = Math.pow(num, 2);
			System.out.print("O número "+num+" é ímpar e elevado ao quadrado equivale: "+conta);
		}

	}

}
