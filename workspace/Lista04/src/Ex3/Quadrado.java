package Ex3;

public class Quadrado implements Figura2D
{
	private double aresta;
	String cor;
	public Quadrado (double aresta, String cor)
	{
		this.aresta = aresta;
		this.cor = cor;
	}
	public double calculaÁrea ()
	{
		return aresta * aresta;
	}
	public double calculaPerímetro ()
	{
		return aresta * 4;
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
