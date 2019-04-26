package com.matera.calculadorasCidades;

import com.matera.desafioCarros.Taxavel;

public class SaoPaulo implements Calculadora{

	@Override
	public int calcularImposto(Taxavel produto) {
		return (int)(produto.getValorBruto() * 1.50);
	}

}
