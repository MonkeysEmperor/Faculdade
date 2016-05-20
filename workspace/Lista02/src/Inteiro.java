public class Inteiro {
	private int número;

	public void atribuir(int valor) {
		número = valor;
	}

	public int quadrado() {
		return número * número;
	}

	public double fatorial() {
		if (número == 1 || número == 0)
			return 1;
		int x = número;
		double resultado = x--;
		while (x > 0) {
			resultado *= x;
			--x;
		}
		return resultado;
	}

	public static void main(String args[]) {
		Inteiro x = new Inteiro();
		x.atribuir(10);
		System.out.println(x.quadrado());
		System.out.println(x.fatorial());
		x.atribuir(4);
		System.out.println(x.quadrado());
		System.out.println(x.fatorial());
	}

}
