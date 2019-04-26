package com.matera.calculadorasCidades;

import java.math.BigDecimal;

import com.matera.desafioCarros.Taxavel;

public class SaoPaulo implements Calculadora{

	@Override
	public BigDecimal calcularImposto(Taxavel produto) {
		BigDecimal imposto = new BigDecimal("1.50");
		return produto.getValorBruto().multiply(imposto);
	}

}
