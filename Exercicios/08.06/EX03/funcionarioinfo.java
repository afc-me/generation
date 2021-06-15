package Class0806;

public class funcionarioinfo {

	public static void main(String[] args) {
		funcionario[] ney = new funcionario[3];
		ney[0]= new funcionario("Ana","Supervisora",8500);
		ney[1]= new funcionario("Flobis","Desenvolvedora",3500);
		ney[2]= new funcionario("Maíra","Desenvolvedora",2500);
		
		for(funcionario brasil:ney)
		{
			brasil.imprimir();
		}
		
		System.out.print("***AUMENTO***\n\n");
		
		for(funcionario paraguay:ney)
		{
			paraguay.aumentarSalario(10);
			paraguay.imprimir();
		}

	}

}
