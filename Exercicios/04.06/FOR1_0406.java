/*
 * Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.
 */
package BlocoUm;

public class FOR1_0406 {

	public static void main(String[] args) {
		
		for(int i=1000;i<=1999;i++)
		{
			if(i%11==5){
				System.out.print("\nO número '"+i+"' tem resto 5 ao ser divido por 11");
			}
		}

	}

}
