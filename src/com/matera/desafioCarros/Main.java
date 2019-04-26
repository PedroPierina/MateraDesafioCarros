package com.matera.desafioCarros;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Peca volante = new Peca("Volante", "Hyundai", new BigDecimal(200.00), Cidades.CAMPINAS);
		Peca motor = new Peca("Motor", "Hyundai", new BigDecimal(5000), Cidades.SUMARE);
		Peca cambio = new Peca("Cambio", "Hyundai", new BigDecimal(3000), Cidades.SAO_PAULO);
		
		List<Peca> pecas = new ArrayList<Peca>();
		
		pecas.add(volante);
		pecas.add(motor);
		pecas.add(cambio);
		
		Carro hb20 = new Carro("hb20", "hyundai", pecas, Cidades.CAMPINAS);
		System.out.println(volante.getValorLiquido());
		System.out.println("Valor liquido do hb20 = " + hb20.getValorLiquido());
	}
}
