package com.matera.calculadorasCidades;

import java.math.BigDecimal;

import com.matera.desafioCarros.Taxavel;

public class Campinas implements Calculadora{

	@Override
	public BigDecimal calcularImposto(Taxavel produto) {
		BigDecimal imposto = new BigDecimal("1.30");
		return produto.getValorBruto().multiply(imposto);
	}
}
