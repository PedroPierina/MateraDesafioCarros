package calculadorasCidades;

public class SaoPaulo implements Calculadora{

	@Override
	public int calcularImposto(int valorBruto) {
		return (int)(valorBruto * 1.50);
	}

}
