/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
package BlocoUm;

import java.util.Scanner;

public class ex1_0306 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		n1 = leia.nextInt();
		System.out.print("Digite um n�mero: ");
		n2 = leia.nextInt();
		System.out.print("Digite um n�mero: ");
		n3 = leia.nextInt();
		
		if (n2>=n1 && n2>=n3)
		{
			System.out.print("O "+n2+" � o maior n�mero");
		}
		else if (n3>=n1 && n3>=n2)
		{
			System.out.print("O "+n3+" � o maior n�mero");
		}
		else
		{
			System.out.print("O "+n1+" � o maior n�mero");
		}

	}

}
