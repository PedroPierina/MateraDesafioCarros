package com.matera.desafioCarros;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class CarroTest {
	
	@Test
	public void testValorLiquido(){
		Peca volante = new Peca("Volante", "Hyundai", new BigDecimal(200.00), Cidades.CAMPINAS);
		Peca motor = new Peca("Motor", "Hyundai", new BigDecimal(5000), Cidades.SUMARE);
		Peca cambio = new Peca("Cambio", "Hyundai", new BigDecimal(3000), Cidades.SAO_PAULO);
		
		List<Peca> pecas = new ArrayList<Peca>();
		
		pecas.add(volante);
		pecas.add(motor);
		pecas.add(cambio);
		
		Carro hb20 = new Carro("hb20", "hyundai", pecas, Cidades.CAMPINAS);
		
		Assert.assertEquals(new BigDecimal("13988.0000"), hb20.getValorLiquido());
	}
	
	@Test
	public void testValorVolante(){
		Peca volante = new Peca("Volante", "Hyundai", new BigDecimal(200.00), Cidades.CAMPINAS);
		Assert.assertEquals(new BigDecimal("260.00"), volante.getValorLiquido());
	}
	
	@Test
	public void testValorMotor(){
		Peca motor = new Peca("Motor", "Hyundai", new BigDecimal(5000), Cidades.SUMARE);
		Assert.assertEquals(new BigDecimal("6000.00"), motor.getValorLiquido());
	}
	
	@Test
	public void testValorCambio(){
		Peca cambio = new Peca("Cambio", "Hyundai", new BigDecimal(3000), Cidades.SAO_PAULO);
		Assert.assertEquals(new BigDecimal("4500.00"), cambio.getValorLiquido());
	}

}
