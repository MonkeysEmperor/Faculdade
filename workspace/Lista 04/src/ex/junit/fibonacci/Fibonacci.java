package ex.junit.fibonacci;
public class Fibonacci {
	static public int fibonacci (int posicao)
	{
		if (posicao == 1 || posicao == 2)
			return 1;
		if (posicao <= 0)
			return -1;
		int num1, num2, resultado;
		num1 = num2 = 1;
		for (int i = 2; i < posicao; i ++)
		{
			resultado = num1 + num2;
			num1 = num2;
			num2 = resultado;
		}
		return num2;
	}
}
