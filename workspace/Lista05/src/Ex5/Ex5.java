package Ex5;
class Animal {
	void nasce() {
	System.out.println("Nasceu um animal");
	}
	
	void cresce() {
	System.out.println("Cresceu um animal");
	}
}

class Mamifero extends Animal {
	void nasce(int i)  {
		System.out.println("Nasceu um mamifero: "+i);
	}
	
	void cresce() {
		System.out.println("Cresceu um mamifero");
	}
	void sangueQuente(){
		System.out.println("Tem sangue quente");
	}
	public static void main(String []argc) {
		Animal x = new Animal();
		x.nasce();   // Método da classe Animal.
		x.cresce();  // Método da classe Animal.
		
		Mamifero m = new Mamifero();
		m.nasce();        // Método da classe Animal.
		m.nasce(1);       // Método da classe Mamífero.
		m.cresce();       // Método da classe Mamífero.
		m.sangueQuente(); // Método da classe Mamífero.
		
		x = m;            // OK, pois Mamifero deriva de Animal.
		x.nasce();        // Método da classe Animal.
		x.cresce();       // Método da classe Mamífero.
		
		// nasce(int a) não pode ser chamado por x já que que esse método não está definido na classe Animal.
		// sangueQuente() não pode ser chamado por x já que esse método não está definido na classe Animal
	}
}