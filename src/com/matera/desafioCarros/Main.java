package com.matera.desafioCarros;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Peca volante = new Peca("Volante", "Hyundai", 200, Cidades.CAMPINAS);
		Peca motor = new Peca("Motor", "Hyundai", 5000, Cidades.SUMARE);
		Peca cambio = new Peca("Cambio", "Hyundai", 3000, Cidades.SAO_PAULO);
		
		List<Peca> pecas = new ArrayList<Peca>();
		
		pecas.add(volante);
		pecas.add(motor);
		pecas.add(cambio);
		
		Carro hb20 = new Carro("hb20", "hyundai", pecas, Cidades.CAMPINAS);
		
		System.out.println("Valor liquido do hb20 = " + hb20.getValorLiquido());
	}
}
