package com.matera.desafioCarros;

public enum Cidades {
	CAMPINAS(1.30), 
	SUMARE(1.20),
	SAO_PAULO(1.50);
	
	private double valorImposto;

	Cidades(double valorImposto){
		this.valorImposto = valorImposto;
	}
	
//	Por porcentagem, posso criar outro metodo que segue outro padrão de calculo
	int calcularImposto(int valorBruto){
		return (int)(valorBruto * this.valorImposto);
	}
}
