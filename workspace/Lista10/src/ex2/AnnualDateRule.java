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

	public static void main (String args[]){
	  AnnualDateRule a = new AnnualDateRule();
	  int b = a.getDayofMonth();
	  System.out.println(b);
	  
	}
}
