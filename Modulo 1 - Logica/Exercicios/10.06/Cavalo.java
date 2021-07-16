package ExAnimais;

public class Cavalo extends Animal {
	public Cavalo()
	{
		super("Cavalo");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que o seu cavalo emite: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nUma das características do cavalo é correr.");
	}


}
