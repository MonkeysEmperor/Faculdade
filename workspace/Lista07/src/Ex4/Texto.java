package Ex4;

public class Texto {
	String[] s;
	public Texto (String[] a){
		s = a;
	}
	public int somarValorChar() throws NumberFormatException{
		int resultado = 0;
		for (int i = 0; i < s.length; i++){
			resultado +=  Integer.parseInt(s[i], 10);
		}
		return resultado;
	}
}
