package exercicio.junit;

public class Funcionario {
	private String primeiroNome, segundoNome, setor;
	private double salario;
	private boolean ativo;
	public Funcionario(String primeiroNome, String segundoNome, String setor, double salario)
	{
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.setor = setor;
		this.salario = salario;
		ativo = true;
	}
	public String nomeCompletoFormatado()
	{
		return (primeiroNome + ' ' + segundoNome);
	}
	public String salarioFormatado()
	{
		String salarioS = String.format("%.2f", salario);
		return ("R$" + salarioS.replace('.', ','));
	}
	
	public void aumentarSalario(double valor)
	{
		if (valor <= 0)
			return;
		salario += valor;
	}
	public boolean trocarDepartamento (String novoDpt)
	{
		if (novoDpt.length() != 3)
			return false;
		setor = novoDpt;
		return true;
	}
	public String departamentoFormatado ()
	{
		return ("Departamento " + setor);
	}
	public String informacoesFormatadas()
	{
		return (nomeCompletoFormatado() + ", " + salarioFormatado() + ", " + departamentoFormatado());
	}
	public boolean ativo ()
	{
		return ativo;
	}
	public void demitirFuncionario ()
	{
		ativo = false;
	}
}
