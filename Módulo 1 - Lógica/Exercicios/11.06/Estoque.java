package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	public static void main (String[] args)
	{
		int oi;
		try(Scanner leia = new Scanner(System.in))
		{
			List<String> lista = new ArrayList<String>();
			
			do
			{
				System.out.print("\n\n\t Digite uma opção: ");
				System.out.print("\n1- Adcionar produtos.\n2-Remover um produto.\n3- Atualizar produto.\n4- Produtos no estoque.\n0- Encerrar programa.\n");
				oi=leia.nextInt();
				
				switch(oi)
				{
				case 1:
					leia.nextLine();
					System.out.print("\nDigite o produto para adicionar ao estoque: ");
					String produto = leia.nextLine();
					lista.add(produto);
					break;
				case 2:
					leia.nextLine();
					System.out.print("\nDigite o produto para remover do estoque: ");
					String produto1 = leia.nextLine();
					if(lista.contains(produto1))
					{
						lista.remove(produto1);
					}
					else
					{
						System.out.print("\nProduto não existente");
					}
					break;
				case 3: 
					leia.nextLine();
					System.out.print("\nDigite o produto que deseja atualizar: ");
					String verifica = leia.nextLine();
					System.out.print("\nDigite o nome do produto que entrará no lugar de "+verifica+":");
					String novo = leia.nextLine();
					if(lista.contains(verifica))
					{
						lista.remove(verifica);
						lista.add(novo);
					}
					else
					{
						System.out.print("\nProduto não existe no estoque.");
					}
					System.out.print(lista);
					break;
				case 4: 
					System.out.print("\nOs produtos do estoque são: ");
					System.out.print(lista);
					break;
					default:
						System.out.print("\nFinalizou o programa. ");
				}
			}
			while(oi!=0);
		}
		
		
		
		
	}

}
