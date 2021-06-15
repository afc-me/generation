package ExAnimais;

public class Preguica extends Animal{
	public Preguica()
	{
		super("Pregui�a");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da pregui�a: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que a sua pregui�a emite: "+somAnimal);
	}
	
	public void subirArvores()
	{
		System.out.println("\nUma das caracter�sticas da pregui�a � subir em �rvores...");
	}

}
