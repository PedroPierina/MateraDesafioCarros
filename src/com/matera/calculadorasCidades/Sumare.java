package com.matera.calculadorasCidades;

import com.matera.desafioCarros.Taxavel;

public class Sumare implements Calculadora {

	@Override
	public int calcularImposto(Taxavel produto) {
		return (int)(produto.getValorBruto() * 1.20);
	}

}
