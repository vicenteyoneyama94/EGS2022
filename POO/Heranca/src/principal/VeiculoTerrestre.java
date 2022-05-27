package principal;

public class VeiculoTerrestre extends Veiculo {

	private String placa;
	private String renavam;
	private double preco;
	
	public VeiculoTerrestre() {
		
	}
	public String getPlaca() {
		return placa + preco;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
}
