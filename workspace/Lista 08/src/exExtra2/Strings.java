package exExtra2;

public class Strings {
	private static final int NELEMENTOS = 100000;
	public static void main (String args[]){
		String s = " ";
		StringBuffer b = new StringBuffer ();
		
		long timeS = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i){
			s = s + 'a';
		}
		timeS = System.currentTimeMillis() - timeS;
		
		
		long timeB = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i){
			b.append('a');
		}
		timeB = System.currentTimeMillis() - timeB;
		
		System.out.println("Tempo de concatenação de strings: " + timeS + "ms");
		System.out.println("Tempo de alteração do StringBuffer: " + timeB + "ms");
		
		// Isso deixa bem claro a diferença de tempo: de 3,3s pra 0,002s.
		// Essa diferença está ligada com a natureza da classe, já que
		// StringBuffer pode ser alterado, e a concatenação de Strings envolve a
		// criação de uma nova String com os valores da antiga string mais a que
		// se quer concatenar, e depois a desalocação de memória da antiga
	}
}
