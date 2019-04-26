package com.matera.calculadorasCidades;

import com.matera.desafioCarros.Taxavel;

public class Campinas implements Calculadora{

	@Override
	public int calcularImposto(Taxavel produto) {
		return (int)(produto.getValorBruto() * 1.30);
	}
}
