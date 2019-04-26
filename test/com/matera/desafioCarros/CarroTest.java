package com.matera.desafioCarros;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class CarroTest {
	
	@Test
	public void testValorLiquido(){
		Peca volante = new Peca("Volante", "Hyundai", 200, Cidades.CAMPINAS);
		Peca motor = new Peca("Motor", "Hyundai", 5000, Cidades.SUMARE);
		Peca cambio = new Peca("Cambio", "Hyundai", 3000, Cidades.SAO_PAULO);
		
		List<Peca> pecas = new ArrayList<Peca>();
		
		pecas.add(volante);
		pecas.add(motor);
		pecas.add(cambio);
		
		Carro hb20 = new Carro("hb20", "hyundai", pecas, Cidades.CAMPINAS);
		
		Assert.assertEquals(13988, hb20.getValorLiquido());
	}
	
	@Test
	public void testValorVolante(){
		Peca volante = new Peca("Volante", "Hyundai", 200, Cidades.CAMPINAS);
		Assert.assertEquals(260, volante.getValorLiquido());
	}
	
	@Test
	public void testValorMotor(){
		Peca motor = new Peca("Motor", "Hyundai", 5000, Cidades.SUMARE);
		Assert.assertEquals(6000, motor.getValorLiquido());
	}
	
	@Test
	public void testValorCambio(){
		Peca cambio = new Peca("Cambio", "Hyundai", 3000, Cidades.SAO_PAULO);
		Assert.assertEquals(4500, cambio.getValorLiquido());
	}

}
