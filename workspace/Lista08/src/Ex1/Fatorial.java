package Ex1;



import java.math.BigInteger;

public class Fatorial {

	static public BigInteger fatorial(int x) {
		if (x == 1 || x == 0)
			return BigInteger.valueOf(1);
		if (x < 0){
			throw new UnsupportedOperationException("Não existe fatorial de números negativos!");
		}
		BigInteger resultado = BigInteger.valueOf(x--);
		while (x > 0) {
			resultado = resultado.multiply(BigInteger.valueOf(x));
			--x;
		}
		return resultado;
	}
}
