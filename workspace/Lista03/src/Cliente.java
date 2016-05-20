
public class Cliente 
{
	private String nome;
	private double saldo;
	private int nConta;
	
	static private int  proxnConta = 1001;
	
	
	public Cliente (String nome)
	{
		this.nome = nome;
		saldo = 0;
		nConta = proxnConta++;
	}
	public Cliente (String nome, double saldo)
	{
		this (nome);
		this.saldo = saldo;
	}
	
	
	public String getNome ()
	{
		return nome;
	}
	public double getSaldo()
	{
		return saldo;
	}
	public int getnConta()
	{
		return nConta;
	}
	public static int getProxnConta()
	{
		return proxnConta;
	}
	
	
	public void saque (double valor)
	{
		saldo -= valor;
	}
	public void deposito (double valor)
	{
		saldo += valor;
	}
	public void impressão ()
	{
		System.out.println("Nome do titular da conta: " + nome);
		System.out.println("Saldo: " + saldo);
		System.out.println("Número da conta: " + nConta);
	}
	public boolean comparaSaldo (double valor)
	{
		return (saldo >= valor);
	}
	public boolean comparaNome (String nome)
	{
		return (this.nome.equals(nome));
	}
	
}
