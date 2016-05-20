package Ex8;

public class Sith extends Pessoa {
	public void consegui()
	{
		System.out.println("Consegui, agora sou um Sith completo");
	}
	public static void main (String args[])
	{
		Sith a = new Sith();
		Pessoa b = a;
		b.forcePush();
	}
	//Como a alocação foi feita para a classe sith, seus métodos sobrescreveram
	//os da classe base, entao "consegui" ficou definido como o "consegui" do 
	//Sith.
	
	//Quando eu falei que Pessoa b = a, eu disse que b é do tipo pessoa; se fosse
	//um parametro de um método, que espera a classe base por não precisar de 
	//membros ou métodos específicos de cada classe derivada, o resultado do 
	//exercício faz muito sentido: um sith também é uma pessoa, só que ele consegue
	//fazer o force push, o que pode ou não influenciar no método que o utiliza.
}
