package Class0806;

import java.text.NumberFormat;

public class funcionario {
	private String nome;
	private String funcao;
	private double salario;
	
	public funcionario(String nome, String funcao,double salario)
	{
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	public void setFun(String funcao)
	{
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public String getFun() {
		return funcao;
	}

	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.print("Nome: "+nome+"\nFunção:"+funcao+"\nSalário: "+this.formatarMoeda()+"\n\n");
	}


}
