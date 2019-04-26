package com.matera.desafioCarros;

import java.math.BigDecimal;

public class Peca implements Taxavel{
	private String nome;
	private String fabricante;
	private BigDecimal valorBruto;
	private BigDecimal valorLiquido;
	private Cidades cidade;
	
	public Peca(String nome, String fabricante, BigDecimal valorBruto, Cidades cidade) {
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
	public BigDecimal getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}
	public Cidades getCidade() {
		return cidade;
	}
	
	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}
	
}
