package br.edu.ifpr.palestra.modelo;

public class Certificado {

	private int livro;
	private int folha;
	private int pagina;
	private int numeroDoCertificado;
	
	private Certificado() {
		
	}
	private Certificado(int livro, int folha, int pagina, int numeroDoCertificado) {
		this.livro = livro;
		this.folha = folha;
		this.pagina = pagina;
		this.numeroDoCertificado = numeroDoCertificado;
	}
	
	private int getLivro() {
		return livro;
	}
	private void setLivro(int livro) {
		this.livro = livro;
	}
	private int getFolha() {
		return folha;
	}
	private void setFolha(int folha) {
		this.folha = folha;
	}
	private int getPagina() {
		return pagina;
	}
	private void setPagina(int pagina) {
		this.pagina = pagina;
	}
	private int getNumeroDoCertificado() {
		return numeroDoCertificado;
	}
	private void setNumeroDoCertificado(int numeroDoCertificado) {
		this.numeroDoCertificado = numeroDoCertificado;
	}
	
}
