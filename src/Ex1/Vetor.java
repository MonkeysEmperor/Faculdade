package Ex1;

public class Vetor {
	private int a = 0;
	
	public void dividePorA(int x){
		x /= a;
	}
	
	public void main (String args[])
	{
		int size = 20;
		int [] a = new int[size];
		boolean error = true;
		while (error == true){
			error = false;
			try {
				a[23] = 50;
				a[255] = 2648;
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Erro encontrado");
				int [] doubleA = new int [2 * size];
				for (int i = 0; i < size; i ++){
					doubleA[i] = a[i];
				}
				a = doubleA;
				size *= 2;
				error = true;
			}
		}
		System.out.println("Tamanho do vetor: " + a.length);
		System.out.println(a[23]);
		System.out.println(a[255]);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
