/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */
package BlocoUm;

import java.util.Scanner;

public class ex4_0306 {

	public static void main(String[] args) {
		int num;
		double conta;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		
		if (num%2==0)
		{
			conta = Math.sqrt(num);
			System.out.print("O n�mero "+num+" � par e sua raiz quadrada �: "+conta);
		}
		else
		{
			conta = Math.pow(num, 2);
			System.out.print("O n�mero "+num+" � �mpar e elevado ao quadrado equivale: "+conta);
		}

	}

}
