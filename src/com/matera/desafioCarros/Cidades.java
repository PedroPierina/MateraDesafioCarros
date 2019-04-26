package com.matera.desafioCarros;

import com.matera.calculadorasCidades.Calculadora;
import com.matera.calculadorasCidades.Campinas;
import com.matera.calculadorasCidades.SaoPaulo;
import com.matera.calculadorasCidades.Sumare;

public enum Cidades {
	CAMPINAS(new Campinas()), 
	SUMARE(new Sumare()),
	SAO_PAULO(new SaoPaulo());
	
	private Calculadora calculadora;

	Cidades(Calculadora calculadora){
		this.calculadora = calculadora;
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}
	
	
//	Por porcentagem, posso criar outro metodo que segue outro padrão de calculo
//	int calcularImposto(int valorBruto){
//		return (int)(valorBruto * this.calculadora);
//	}
}
