package principal;

public class TestaHeranca {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		veiculo.setAnoFabricacao(2022);

		VeiculoTerrestre veiculoterrestre = new VeiculoTerrestre();
		veiculoterrestre.setAnoFabricacao(2021);
		
		Moto moto = new Moto();
		moto.setCilindradas(300);
	}

}
