package Turma24;

public class Cardapio extends GeraComanda {

	private Integer id;
	private String prato;
	private String bebida;
	private Double valor;

	public Cardapio() {

	}

	public Cardapio(Integer id, String prato, String bebida, Double valor) {
		super();
		this.id = id;
		this.bebida = bebida;
		this.prato = prato;
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String toString() {
		return "\nComanda: " + id + "\nPrato: " + prato + "\nBebida: " + bebida + "\nValor total: " + valor+" R$.";

	}

	public void valorFinal(Double percentage) {
		valor -= valor * percentage / 100.0;
		System.out.println("\nO valor da comanda " + getId() + " com desconto é de: " + valor+" R$.");
	}
}