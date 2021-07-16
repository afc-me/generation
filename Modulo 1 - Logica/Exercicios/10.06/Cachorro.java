package ExAnimais;

public class Cachorro extends Animal {
	public Cachorro()
	{
		super("Cachorro");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cachorro: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que o seu cachorro emite: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nUma das características do cachorro é correr.");
	}


}
