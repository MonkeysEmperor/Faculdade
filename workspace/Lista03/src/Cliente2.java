
public class Cliente2 {
	
	private String nome;
	private double saldo;
	private int nConta;
	private boolean bloqueado;
	
	static private int  proxnConta = 1001;
	static private int nClientesBloq = 0;
	
	public Cliente2 (String nome)
	{
		this.nome = nome;
		saldo = 0;
		nConta = proxnConta++;
	}
	public Cliente2 (String nome, double saldo)
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
	public boolean getBloquado()
	{
		return bloqueado;
	}
	public static int getnClientesBloq()
	{
		return nClientesBloq;
	}
	
	
	public boolean saque (double valor)
	{
		if (!bloqueado)
		{
			saldo -= valor;
			if (saldo < 0)
			{
				bloqueado = true;
				nClientesBloq++;
			}
			return true;
		}
		return false;
	}
	public void deposito (double valor)
	{
		saldo += valor;
		if (bloqueado && saldo >= 0)
		{
			bloqueado = false;
			nClientesBloq--;
		}
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
