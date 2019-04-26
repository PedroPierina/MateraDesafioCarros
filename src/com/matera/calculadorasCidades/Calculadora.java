package com.matera.calculadorasCidades;

import java.math.BigDecimal;

import com.matera.desafioCarros.Taxavel;

public interface Calculadora {
	BigDecimal calcularImposto(Taxavel produto);
}
