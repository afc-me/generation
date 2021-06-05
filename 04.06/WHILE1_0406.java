/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */
package BlocoUm;

import java.util.Scanner;

public class WHILE1_0406 {

	public static void main(String[] args) {
		int idade, maior = 0, menor = 0;
		Scanner valley = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = valley.nextInt();
		while(idade!=-99)
		{
			if(idade<=21)
			{
				menor++;
			}
			if(idade >= 50)
			{
				maior++;
			}
			
			System.out.print("Digite sua idade: ");
			idade = valley.nextInt();
		}
		
		System.out.print("São "+menor+" menores de 21 e "+maior+" maiores de 50.");

		

	}

}
