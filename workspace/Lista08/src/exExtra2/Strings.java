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
		
		System.out.println("Tempo de concatena��o de strings: " + timeS + "ms");
		System.out.println("Tempo de altera��o do StringBuffer: " + timeB + "ms");
		
		// Isso deixa bem claro a diferen�a de tempo: de 3,3s pra 0,002s.
		// Essa diferen�a est� ligada com a natureza da classe, j� que
		// StringBuffer pode ser alterado, e a concatena��o de Strings envolve a
		// cria��o de uma nova String com os valores da antiga string mais a que
		// se quer concatenar, e depois a desaloca��o de mem�ria da antiga
	}
}
