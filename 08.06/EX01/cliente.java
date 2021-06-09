package Class0806;

public class cliente {
	private String nome;
	private String endereco;
	private int idade;
	
	public cliente(String nome, String endereco, int idade)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}
	
	public void imprimir()
	{
		System.out.print("Nome: "+nome+"\nEndereço: "+endereco+"\nIdade: "+idade+"\n\n");
	}
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setEnd(String endereco)
	{
		this.endereco = endereco;
	}
	
	public String getEnd()
	{
		return endereco;
	}
	
	public void setId(int idade)
	{
		this.idade=idade;
	}
	
	public int getIdade()
	{
		return idade;
	}

}
