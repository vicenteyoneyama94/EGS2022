package br.edu.ifpr.palestra.modelo;

import java.util.Date;

public class Palestra {

	protected String tela;
	protected Date diaHora;
	protected boolean exigeFrequencia;
	
	protected Palestra(){
		
	}
	protected Palestra(String tela, Date diaHora, boolean exigeFrequencia) {
		this.tela = tela;
		this.diaHora = diaHora;
		this.exigeFrequencia = exigeFrequencia;
	}
	protected String getTela() {
		return tela;
	}
	protected void setTela(String tela) {
		this.tela = tela;
	}
	protected Date getDiaHora() {
		return diaHora;
	}
	protected void setDiaHora(Date diaHora) {
		this.diaHora = diaHora;
	}
	protected boolean isExigeFrequencia() {
		return exigeFrequencia;
	}
	protected void setExigeFrequencia(boolean exigeFrequencia) {
		this.exigeFrequencia = exigeFrequencia;
	}
	
	
}
