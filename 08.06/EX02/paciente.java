package Class0806;

public class paciente {
	private String nome;
	private String condicao;
	private String enfermidade;
	private int idade;

	public paciente (String nome, String condicao, String enfermidade, int idade)
	{
		this.nome = nome;
		this.condicao = condicao;
		this.enfermidade = enfermidade;
		this.idade = idade;
	}
	
	public void imprimir() {
		System.out.print("Nome: "+nome+"\nCondição: "+condicao+"\nEnfermidade: "+enfermidade+"\nIdade: "+idade+"\n\n");
	}
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setCond(String condicao)
	{
		this.condicao = condicao;
	}
	
	public String getCond()
	{
		return condicao;
	}
		
	public void setEn(String enfermidade)
	{
		this.enfermidade = enfermidade;
	}
	
	public String getEn()
	{
		return enfermidade;
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
