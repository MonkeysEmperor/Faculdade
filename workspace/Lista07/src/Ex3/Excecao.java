package Ex3;

public class Excecao {
	
	static int fatorial (int x) throws Exception
	{
		if (x < 0)
			throw new Exception();
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
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(y);
	}
}
