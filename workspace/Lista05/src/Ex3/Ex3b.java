package Ex3;
final class Ex3a{
	Ex3a (){
	System.out.println("Constroi Ex3a");
	}
}
public class Ex3b /*extends Ex3a*/{
	Ex3b () {
	System.out.println("Constroi Ex3b");
	}
}

// Mensagem de ERRO:
// -Syntax error on token "ex3", expected after this token;
// -The type Ex3 cannot subclass the final class ex3.
// final em classes não permite a herança da mesma.