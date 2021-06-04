/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
package BlocoUm;

import java.util.Scanner;

public class ex2_0206 {

	public static void main(String[] args) {
		int valor, dias, mes, ano;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite quantos dias de vida você tem: ");
		valor = leia.nextInt();
		
		ano = valor/365;
		mes = (valor%365)/30;
		dias = (valor%365)%30;
		
		System.out.print("Você tem "+ano+" anos, "+mes+" meses e "+dias+" dias de vida");

	}

}
