/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */
package BlocoUm;

import java.util.Scanner;

public class ex3_0306 {

	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.print("Categoria Infantil");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.print("Categoria Juvenil");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.print("Categoria Adulta");
		}
		else
		{
			System.out.print("Categoria Indisponível");
		}

	}

}
