package ex2;

public class AnnualDateRule {
	/*
	 * Construtor padrão.
	 */
	protected AnnualDateRule() {
	}

	/** Dia do mês. */
	private int dayOfMonth;

	/**
	 * Retorna o dia do mês.
	 * 
	 * @return o dia do mês
	 */
	public int getDayofMonth() {
		return dayOfMonth;
	}

	public static void main(String args[]) {
		AnnualDateRule a = new AnnualDateRule();
		int b = a.getDayofMonth();
		System.out.println(b);

	}
	// O código é ruim primeiramente porque não compila, e, depois de corrigido
	// para se tornar compilável (removendo o () da inicialização da classe),
	// ele ainda tem comentários desnecessários já que explicam exatamente o
	// nome das variáveis ou conceitos básicos de programação. Além disso, o
	// construtor não inicializa a variável dayOfMonth e nem testa o valor para
	// ver se é válido (dia do mes é maior que zero e menor ou igual a 31). A
	// função da classe não está bem definida, não consigo entender em que
	// contexto seria usada pelo seu nome, ou seja, tem um péssimo nome também.
}
