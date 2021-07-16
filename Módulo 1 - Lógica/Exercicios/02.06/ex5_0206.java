/*
 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
 */
package BlocoUm;

import java.util.Scanner;

public class ex5_0206 {

	public static void main(String[] args) {
		int n1, n2, n3, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		n1 = leia.nextInt();
		System.out.print("Digite a segunda nota: ");
		n2 = leia.nextInt();
		System.out.print("Digite a terceira nota: ");
		n3 = leia.nextInt();
		
		media = (n1+n2+n3)/3;
		
		System.out.print("A média é: "+media);

	}

}
