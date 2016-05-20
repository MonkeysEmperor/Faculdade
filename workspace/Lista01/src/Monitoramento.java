
public class Monitoramento 
{
	
	public void monitoraFatorial (int x)
	{
		int numeroFatorial, contaAtual;
		numeroFatorial = x;
		contaAtual = 0;
		int resultado = 1;
		while (x > 0)
		{
			resultado *= fatorial (x);
			x = x - 2;
		}
		Numero a = new Numero();
		if (a.fatorial(numeroFatorial) == resultado)
		{
			x = numeroFatorial;
			System.out.println("Método fatorial do objeto funciona corretamente!");
			resultado = 1;
			double porcentagem;
			while (x > 0)
			{
				resultado *= fatorial (x);
				x = x - 2;
				contaAtual++;
			
				porcentagem = (100 * contaAtual)/ (numeroFatorial - 1);
				System.out.println ("Calculando " + numeroFatorial + "!: " + porcentagem + "% completo");
			}
			if (x <= 0)
			{
				System.out.print ("Completo! O resultado é " + resultado);
			}
		}
	}
	
	int fatorial (int x)
	{
		if (x == 1 || x == 0)
			return 1;
		return x * (x - 1);
	}
	
	public static void main (String[]args)
	{
		Monitoramento x = new Monitoramento();
		int n;
		n = Integer.parseInt(args[0]);
		x.monitoraFatorial(n);
	}
	
	class Numero 
	{
		public int fatorial (int x)
		{
			if (x == 1 || x == 0)
				return 1;
			int resultado = x--; 
			while (x > 0)
			{				
				resultado *= x;
				--x;
			}
			return resultado;
		}
	}
}
