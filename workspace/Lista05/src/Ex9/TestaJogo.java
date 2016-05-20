package Ex9;


abstract class Jogo  {
	abstract public void tipoJogo();
}

class FPS extends Jogo{
	public void tipoJogo() {
		System.out.println("First Person Shooter");
	}
	static void downcast(Jogo v){
		((FPS)v).tipoJogo();	
	}	
}	
	
public class TestaJogo {
	public static void main(String [] argc) {
		FPS v = new FPS();
		FPS.downcast(v);
		Jogo x = new FPS();
		x.tipoJogo();	
	}
}

// Ao adicionar a definição abstrata do metodo, não é mais
// necessário realizar o downcast