package Ex2;

public class DiferencaFinalStatic {
	static final public String nome = "Terra";
	final public String nome2 = "Marte";
	public static void main (String args[])
	{
		DiferencaFinalStatic x = new DiferencaFinalStatic();
		System.out.println(x.nome2);
		//System.out.println(x.nome); -> a linha executa mas contém warnings
		System.out.println(DiferencaFinalStatic.nome);
		//System.out.println(DiferencaFinalStatic.nome2); -> a linha não executa
		
		//Na prática, a diferença entre as duas declarações está na necessidade de 
		//criar um objeto para acessar o campo ou não, porém ambas não deixam alterar
		//o campo.
	}
}
