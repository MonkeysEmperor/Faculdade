package Ex5;

public class SomaStringMelhorado {
	String[] s;
	public SomaStringMelhorado (String[] a){
		s = a;
	}
	public int somarValorChar(){
		int resultado = 0;
		for (int i = 0; i < s.length; i++){
			try {
			resultado +=  Integer.parseInt(s[i], 10);
			} catch (NumberFormatException e){
				System.out.println("String " + i + " não é preenchida somente por números!");
				continue;
			}
			finally {
				System.out.println(resultado);
			}
		}
		return resultado;
	}
	public static void main (String args[]){
		String a = "123456 ";
		String b = "312fde";
		String c = "019284";
		String d = "aisndgs";
		String s[]= {a, b, c, d};
		SomaStringMelhorado texto = new SomaStringMelhorado(s);
		int x = texto.somarValorChar();
		System.out.println("O valor de x é: " + x);
	}
}

