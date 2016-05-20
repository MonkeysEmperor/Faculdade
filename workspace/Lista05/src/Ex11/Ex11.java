package Ex11;

public class Ex11 {
	public static void main(String [] args){
	Um.main(null);
	Dois.main(null);
	Tres.main(null);
	}
}

class Um{
	public static void main(String [] args){
		System.out.println("Um ");
	}
}
class Dois{
	public static void main(String [] args){
		System.out.println("Dois ");
	}
}
class Tres{
	public static void main(String [] args){
		System.out.println("Tres ");
	}
}

// Foi possível compilar o programa.
// Com um método main associado a cada classe, você tem programas independentes
// que podem ser acessados por um programa maior que junta todos eles
