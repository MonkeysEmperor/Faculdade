package Ex1;
/*
	Gabriel Rocha Amorim - 9395112
	Rafael Fernandes Alencar - 9344730
*/
class Base {
	Base(int a) {
	System.out.println("Constroi Base");
	}
}

public class Derivada extends Base {
	Derivada () {
    super(2); //chama o contrutor da classe base com o parâmetro certo
	System.out.println("Constroi Derivada");
	}
	
	public static void main(String []argc){
	Derivada obj = new Derivada();
	}
}
