
public class ContaCorrente {

	private String nome;
	private int nconta;
	private double saldo;
	private static String nomeDoBanco;
	public void setNome(String n){
		nome = n;
	}
	public String getNome(){
		return nome;
	}
	public ContaCorrente (String nome, int nconta, double saldo){
		this.nome = nome;
		this.nconta = nconta;
		this.saldo = saldo;
	}
	public ContaCorrente (String nome, int nconta){
		this.nome = nome;
		this.nconta = nconta;
		saldo = 0;
	}
	public void setNomeBanco(String n){
		nomeDoBanco = n;
	}
	public void imprime (){
		System.out.println("Você está no " + nomeDoBanco);
		System.out.println("Nome: " + nome);
		System.out.println("Número da conta: " + nconta);
		System.out.println("Saldo: " + saldo);
		
	}
}
