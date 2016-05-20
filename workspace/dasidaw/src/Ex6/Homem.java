package Ex6;

public class Homem extends Mamifero  {
	void nasce()  {
		System.out.println("Nasceu um homem");
		}
	void cresce()  {
		System.out.println("Cresceu um homem");
		}
	public static void main(String []argc) {
		Animal x = new Animal();
		x.nasce();
		Homem h = new Homem();
		h.nasce();
		x = h; // OK, pois Homem deriva de Animal
		x.nasce();
	}
	//Override é o que está acontecendo entre as classes: os métodos das classes
	//bases são redefinidos pelas classes derivadas, tendo entao um "método que 
	//se comporta difente para cada classe"
	//Overload é o que acontece quando eu tenho várias maneiras de chamar um 
	//método, alterando os parâmetros. Em Mamifero, um exemplo disso acontece: 
	//se eu chamo nasce(true) o comportamento será diferente da chamada nasce()
}