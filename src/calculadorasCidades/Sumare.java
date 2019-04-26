package calculadorasCidades;

public class Sumare implements Calculadora {

	@Override
	public int calcularImposto(int valorBruto) {
		return (int)(valorBruto * 1.20);
	}

}
