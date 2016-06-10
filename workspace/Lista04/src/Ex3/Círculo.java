package Ex3;

public class Círculo implements Figura2D
{
	private double raio;
	String cor;
	public Círculo (double raio, String cor)
	{
		this.raio = raio;
		this.cor = cor;
	}
	public double calculaÁrea ()
	{
		return raio * raio * Math.PI;
	}
	public double calculaPerímetro ()
	{
		return raio * 2 * Math.PI;
	}
	public void mudaCor (String cor)
	{
		this.cor = cor;
	}
	public String pegaCor ()
	{
		return cor;
	}
}