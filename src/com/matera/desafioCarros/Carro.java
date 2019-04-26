package com.matera.desafioCarros;

import java.util.List;

public class Carro implements Taxavel{
	private String nome;
	private String fabricante;
	private int valorBruto;
	private int valorLiquido;
	private List<Peca> pecas;
	private Cidades cidade;

	public Carro(String nome, String fabricante, List<Peca> pecas, Cidades cidade) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.cidade = cidade;
		
		pecas.forEach(p -> this.valorLiquido += p.getValorLiquido());
		
		this.valorBruto = this.valorLiquido;
		this.valorLiquido = this.cidade.getCalculadora().calcularImposto(this);
		this.setPecas(pecas);
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
	
	public int getValorLiquido(){
		return valorLiquido;
	}

	public List<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(List<Peca> pecas) {
		this.pecas = pecas;
	}

}
