import java.lang.Math;

public class Aleatório {
	static public void imprimir(int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.println(Math.random());
		}
	}
	public static void main(String args[]) {
		imprimir(20);
	}

}
