package Ex1;
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