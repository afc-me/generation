package Herança_0906;

public class cavalo extends animal{
	private String som;
	private String correr;
	
	public cavalo(String nome, int idade, String som, String correr)
	{
		super(nome,idade);
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
		System.out.print("Animal: Cavalo\nNome: "+getNome()+"\nIdade: "+getIdade()+"\n");
	}
	
	public void somdoanimal()
	{
		System.out.print("cavalo says: iiiiirri\n\n");
	}

}
