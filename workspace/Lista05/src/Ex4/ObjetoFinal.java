package Ex4;

public class ObjetoFinal {
	int x;
	public static void main (String args[])
	{
		final ObjetoFinal a = new ObjetoFinal();
		ObjetoFinal b = new ObjetoFinal();
		//a = b;// -> atribuir outro ponteiro à variável a causa erro de compilação
		a.x = 10;
		System.out.println(a.x);
		a.x = 20; // Embora o objeto seja final, seus membros não o são
		System.out.println(a.x);
		b = a;
		System.out.println(b.x);
		//a = null;// -> também causa erro
	}
}
