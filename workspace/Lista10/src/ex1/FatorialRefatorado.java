package ex1;

public class FatorialRefatorado {
	protected static double fatorial(int numeroFatorial) {
		double resultadoFatorial = numeroFatorial;
		for (; numeroFatorial > 1; numeroFatorial--) {
			resultadoFatorial *= (numeroFatorial - 1);
		}
		return resultadoFatorial;
	}

	public static void main(String args[]) {
		System.out.println(fatorial(Integer.parseInt(args[1])));
	}
}
