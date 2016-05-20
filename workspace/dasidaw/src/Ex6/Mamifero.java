package Ex6;

public class Mamifero extends Animal {
	void nasce(boolean comSaude)  {
		if (comSaude)
			System.out.println("Nasceu um mamifero com saúde");
		else 
			System.out.println("Nasceu um mamifero doente");
	}
	void cresce() {
		System.out.println("Cresceu um mamifero");
	}
}
