/*
 * Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 */
package BlocoUm;

import java.util.Scanner;

public class ex1_0206 {

	public static void main(String[] args) {
		int dia, mes, ano, conta;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu dia de nascimento: ");
		dia = leia.nextInt();
		System.out.print("Digite o m�s de nascimento: ");
		mes = leia.nextInt();
		System.out.print("Digite sua idade: ");
		ano = leia.nextInt();
		
		conta = (ano*365) + (mes*30)+dia;
		System.out.print("Voc� tem "+conta+" dias de vida");

	}

}
