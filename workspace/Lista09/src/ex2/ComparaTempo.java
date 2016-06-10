package ex2;

import java.math.BigInteger;

import ex1.EditTxt;

public class ComparaTempo {
	final private static int NUMERO_DE_LOOPS = 100;

	public static void main(String args[]) {
		BigInteger soma = BigInteger.valueOf(0);
		EditTxt a = new EditTxt();
		long fileTimeArray[] = new long[NUMERO_DE_LOOPS];
		for (int i = 0; i < NUMERO_DE_LOOPS; i++) {
			fileTimeArray[i] = System.nanoTime();
			a.write("saidaTeste.txt", "Testando tempo de escrita no terminal e nos arquivos");
			fileTimeArray[i] = System.nanoTime() - fileTimeArray[i];
			soma = soma.add(BigInteger.valueOf(fileTimeArray[i]));
		}
		String fileTime = (soma.divide(BigInteger.valueOf(NUMERO_DE_LOOPS)).toString());

		soma = BigInteger.valueOf(0);
		long terminalTimeArray[] = new long[NUMERO_DE_LOOPS];
		for (int i = 0; i < NUMERO_DE_LOOPS; i++) {
			terminalTimeArray[i] = System.nanoTime();
			System.out.println("Testando tempo de escrita no terminal e nos arquivos");
			terminalTimeArray[i] = System.nanoTime() - terminalTimeArray[i];
			soma = soma.add(BigInteger.valueOf(terminalTimeArray[i]));
		}
		String terminalTime = (soma.divide(BigInteger.valueOf(NUMERO_DE_LOOPS)).toString());

		System.out.println("Tempo para escrever no arquivo:  " + fileTime + "ns");
		System.out.println("Tempo para escrever no terminal: " + terminalTime + "ns");
	}
	// Dá pra ver que no terminal é muito mais rápido: Não é necessário acessar
	// o disco rígido para nada, somente é necessário passar a string para a
	// memória, que é muito mais rápida
}
