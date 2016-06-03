package Ex2;

import Ex1.Vetor;

public class Independente {
	private static void mexer(Vetor[] v, int index) {
		int b = 20;
		try {
			v[index].dividePorA(b);

		} catch (NullPointerException e) {
			System.out.println("Olha o erro maaais famoso aqui " + e);
			return;

		} catch (ArithmeticException e) {
			System.out.println("Dividiu por 0 " + e);
			v[index].setA(1);
			return;
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Fora do tamanho do vetor" + e);
			return;
		}

		System.out.println("Sem erros!");
	}

	public static void main(String args[]) {
		Vetor[] i = new Vetor[2];
		mexer(i, 2); //Na primeira vez dá erro porque a posicao 2 nao existe no vetor
		mexer (i, 1); //Da segunda vez tem que ser o erro de null pointer exception
		
		for (int j = 0; j < i.length; j++)
		{
			i[j] = new Vetor();
		}
		
		mexer(i, 1); //Nessa segunda vez, o erro é na divisão por zero
		mexer(i, 1); //Aqui já roda sem erros

	}
}
