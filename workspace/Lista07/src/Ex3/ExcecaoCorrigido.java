package Ex3;

public class ExcecaoCorrigido {

	static int fatorial (int x) throws NumberFormatException
	{
		if (x < 0)
			throw new NumberFormatException("Nao existe fatorial de numeros negativos!");;
		if (x == 1 || x == 0)
			return 1;
		return x * (x - 1);
	}
	public static void main (String args[])
	{
		int x = -5;
		int y = 0;
		try{
			y = fatorial(x);
		}catch (NumberFormatException e){
			System.out.println(e.getMessage());
		}
		System.out.println(y);
	}
}