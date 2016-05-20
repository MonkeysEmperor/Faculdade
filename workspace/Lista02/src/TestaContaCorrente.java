
public class TestaContaCorrente {
	public static void testar (){
		ContaCorrente cc = new ContaCorrente("Mace Windu", 22736, 4000);
		System.out.println(cc.getNome());
		cc.imprime();
		cc.setNome("Anakin Skywalker");
		cc.imprime();
		ContaCorrente cc2 = new ContaCorrente("Obi-Wan", 3224);
		System.out.println(cc2.getNome());
		cc2.imprime();
		cc2.setNome("Mestre Yoda");
		cc2.imprime();
		System.out.println();
		cc.setNomeBanco("Banco do Brasil");// Aqui eu atribuí um nome para o banco
		// desse objeto, e pedi pra imprimir as informações do outro objeto logo
		// em seguida:
		cc2.imprime();
		ContaCorrente cc3 = new ContaCorrente(" ", 0);
		cc3.imprime();
		
		
	}
	public static void main (String args[]){
		testar();
		//no teste a variavel estatica se alterou para todos os objetos
	}
}
