package com.matera.desafioCarros;

public class Peca implements Taxavel{
	private String nome;
	private String fabricante;
	private int valorBruto;
	private int valorLiquido;
	private Cidades cidade;
	
	public Peca(String nome, String fabricante, int valorBruto, Cidades cidade) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.valorBruto = valorBruto;
		this.cidade = cidade;
		this.valorLiquido = this.cidade.getCalculadora().calcularImposto(this);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(int valorBruto) {
		this.valorBruto = valorBruto;
	}
	public Cidades getCidade() {
		return cidade;
	}
	
	public int getValorLiquido() {
		return valorLiquido;
	}
	
}
