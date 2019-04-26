package calculadorasCidades;

public class Campinas implements Calculadora{

	@Override
	public int calcularImposto(int valorBruto) {
		return (int)(valorBruto * 1.30);
	}
}
