package Ex3;
public class Retângulo implements Figura2D
{
	private double comprimento, altura;
	String cor;

	public Retângulo(double comprimento, double altura, String cor) {
		this.comprimento = comprimento;
		this.cor = cor;
		this.altura = altura;
	}

	public double calculaÁrea() {
		return comprimento * altura;
	}

	public double calculaPerímetro() {
		return 2 * comprimento + 2 * altura;
	}

	public void mudaCor(String cor) {
		this.cor = cor;
	}

	public String pegaCor() {
		return cor;
	}
}