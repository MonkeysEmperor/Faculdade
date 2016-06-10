package Ex6;

public class RecebeCodigo {
	static void recebeCodigo(String s) throws Exception {
		if (s.length() < 14)
			throw new StringNaoGrandeoSuficiente();
		String tipo;
		int linhas = 0, colunas = 0;
		s.substring(0, 7);
	
		if (s.substring(0, 7).equalsIgnoreCase("matriz ")) {
			tipo = s.substring(7, 11);
			if (tipo.equalsIgnoreCase("0-1 ")  || tipo.equalsIgnoreCase("int ")  || tipo.equalsIgnoreCase("doub")){
				int index = 11;
				if (tipo.equalsIgnoreCase("doub")){
					tipo = s.substring(7, 14);
					if (tipo.equalsIgnoreCase("double "))
						index = 14;
					else
						throw new TipoDesconhecido();
				}
				
				int a = s.indexOf(' ', index);
				try {
					linhas = Integer.parseInt(s.substring(index, a));
					if (s.indexOf(' ', a + 1) != -1)
						colunas = Integer.parseInt(s.substring(a + 1, s.indexOf(' ', a + 1)));
					else
						colunas = Integer.parseInt(s.substring(a + 1, s.length()));
				} catch (NumberFormatException e) {
					throw new IndicesNaoEncontrados ();
				} catch (IndexOutOfBoundsException e) {
					throw new StringNaoGrandeoSuficiente();
				}
				if (linhas <= 0 || colunas <= 0)
					throw new IndicesInvalidos();
			} else
				throw new TipoDesconhecido();
		} else
			throw new NaoComecaComMatriz();
	}
}

class NaoComecaComMatriz extends Exception {

	public String toString() {
		return "Essa string não começa com matriz";
	}
	//Nao aprendemos na aula esse Id que o compilador pede, nao sei corrigir
}

class TipoDesconhecido extends Exception {

	public String toString() {
		return "Tipo da matriz desconhecido";
	}

}

class IndicesInvalidos extends Exception {

	public String toString() {
		return "O indice de linha e/ou coluna é negativo ou nulo";
	}

}

class IndicesNaoEncontrados extends Exception {
	public String toString() {
		return "Nao conseguiu achar os indices da linha e/ou da coluna";
	}
}

class StringNaoGrandeoSuficiente extends Exception {
	public String toString() {
		return "A string é muito pequena para que se possa obter todos os dados necessários";
	}
}
