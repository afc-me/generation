package Herança_0906;

public class cachorro extends animal{
	private String som;
	private String correr;
	
	public cachorro (String nome, int idade,String som, String correr)
	{
		super(nome, idade);
		this.som = som;
		this.correr = correr;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimir()
	{
		System.out.print("Animal: Cachorro\nNome: "+getNome()+"\nIdade: "+getIdade()+"\n");
	}
	
	public void somdoanimal()
	{
		System.out.print("cachorro says: auau\n\n");
	}
	

}
