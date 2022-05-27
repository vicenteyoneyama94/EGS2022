package principal;

public class Veiculo {
	private double preco;
	private int anoFabricacao;
	private double peso;
	
	public double getPreco() {
		return this.preco;
	}
	protected int getAnoFabricacao() {
		return anoFabricacao;
	}

	protected void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected void setPreco(double preco) {
		this.preco = preco;
	}

	
}
