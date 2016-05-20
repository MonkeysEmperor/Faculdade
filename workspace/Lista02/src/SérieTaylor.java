import java.lang.Math;;
public class SérieTaylor {
	double x;
	double precisão;
	private double cos2 (int n)
	{
		
		if (n <= 0)
		{
			return 1.0;
			
		}
			
		double curX = x * x;
		double resultado = 1.0;
		double termoN;
		for (int i = 1; i < n; i ++, curX *= (x*x))
		{
			termoN = curX / (double) fatorial (2 * i);
			if (i % 2 == 1)
				resultado -= termoN;
			else
				resultado += termoN;
		}
		return resultado;
	}
	static private double fatorial (int x)
	{
		if (x == 1 || x == 0)
			return 1;
		double resultado = x--; 
		while (x > 0)
		{				
			resultado *= x;
			--x;
		}
		return resultado;
	}
	private double tan2 ()
	{
		return Math.tan(x);
	}
	public static void main (String[] args)
	{
		SérieTaylor num = new SérieTaylor(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		System.out.println(num.cos());
		System.out.println(num.tan());
	}
	//as funcoes cos e tan sao as que monitoram o funcionamento das funcoes cos2 e tan2 e as que retornam o valor requisitado
	public double cos ()
	{
		int n = 1;
		while (Math.abs(Math.cos(x) - cos2 (n)) > precisão && n < 100) n++;
		if (n == 100) System.out.println("Não conseguiu precisão desejada no cosseno!");
		return cos2 (n);
	}
	public double tan ()
	{
		if (Math.abs(tan2() - Math.sin(x)/Math.cos(x)) > precisão)
		{
			System.out.println("Não conseguiu precisão desejada na tangente!");
			return Math.tan(x);
		}
		return Math.tan(x);
	}
	public SérieTaylor (double precisão, double x)
	{
		this.precisão = precisão;
		this.x = x;
	}
	
}
