/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
package BlocoUm;

import java.util.Scanner;

public class ex1_0306 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		n1 = leia.nextInt();
		System.out.print("Digite um número: ");
		n2 = leia.nextInt();
		System.out.print("Digite um número: ");
		n3 = leia.nextInt();
		
		if (n2>=n1 && n2>=n3)
		{
			System.out.print("O "+n2+" é o maior número");
		}
		else if (n3>=n1 && n3>=n2)
		{
			System.out.print("O "+n3+" é o maior número");
		}
		else
		{
			System.out.print("O "+n1+" é o maior número");
		}

	}

}
