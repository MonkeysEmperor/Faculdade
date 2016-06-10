package ex3ex4;

import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.*;

public class Cubo {
	private static final int NELEMENTOS = 150000;
	int altura, comprimento, profundidade;

	Cubo(int altura, int comprimento, int profundidade) {
		this.altura = altura;
		this.comprimento = comprimento;
		this.profundidade = profundidade;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Cubo) {
			return ((Cubo) obj).altura == this.altura && ((Cubo) obj).profundidade == this.profundidade
					&& ((Cubo) obj).comprimento == this.comprimento;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return 1000 * altura + comprimento + profundidade;
	}

	public static void main(String args[]) {
		ArrayList<Cubo> al = new ArrayList<>();
		long timeAlAdd = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i) {
			al.add(new Cubo(i, i * 5, 5 * i + 5));
		}
		timeAlAdd = System.currentTimeMillis() - timeAlAdd;

		long timeContainsAl = System.currentTimeMillis();

		for (int i = 0; i < NELEMENTOS; ++i) {
			al.contains(new Cubo(70, 70 * 5, 70 * 5 + 5));
		}
		timeContainsAl = System.currentTimeMillis() - timeContainsAl;

		LinkedList<Cubo> ll = new LinkedList<>();
		long timeLlAdd = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i) {
			ll.add(new Cubo(i, i * 7, 7 * i + 5));
		}
		timeLlAdd = System.currentTimeMillis() - timeLlAdd;

		Stack<Cubo> st = new Stack<>();
		long timeStAdd = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i) {
			st.push(new Cubo(i, i * 13, 13 * i + 5));
		}
		timeStAdd = System.currentTimeMillis() - timeStAdd;

		long timeAlGet = System.currentTimeMillis();
		
		Cubo c;//Usada só pra testar o tempo de armazenamento
		
		for (int i = 0; i < NELEMENTOS; ++i) {
			c = al.get(i);
		}
		timeAlGet = System.currentTimeMillis() - timeAlGet;

		long timeLlGet = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i) {
			c = ll.get(i);
		}
		timeLlGet = System.currentTimeMillis() - timeLlGet;

		long timeLlGetIt = System.currentTimeMillis();
		Iterator<Cubo> it2 = ll.iterator();
		for (int i = 0; i < NELEMENTOS; ++i) {
			c = it2.next();
		}
		timeLlGetIt = System.currentTimeMillis() - timeLlGetIt;

		long timeMergeAlLl = System.currentTimeMillis();
		al.addAll(ll);
		timeMergeAlLl = System.currentTimeMillis() - timeMergeAlLl;

		long timeDisjoin = System.currentTimeMillis();
		al.removeAll(ll);
		timeDisjoin = System.currentTimeMillis() - timeDisjoin;

		long timeAlRemove = System.currentTimeMillis();
		int alSize = al.size();
		for (int i = 0; i < alSize; ++i) {
			al.remove(0);
		}
		timeAlRemove = System.currentTimeMillis() - timeAlRemove;

		long timeLlRemove = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i) {
			ll.remove(0);
		}
		timeLlRemove = System.currentTimeMillis() - timeLlRemove;

		long timeStPop = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i) {
			st.pop();
		}
		timeStPop = System.currentTimeMillis() - timeStPop;

		Set<Cubo> s = new HashSet<>();
		long timeSAdd = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i) {
			s.add(new Cubo(i, i * 5, 5 * i + 5));
		}
		timeSAdd = System.currentTimeMillis() - timeSAdd;

		Iterator<Cubo> it = s.iterator();
		long timeSGet = System.currentTimeMillis();
		while (it.hasNext()) {
			c = it.next();
		}
		timeSGet = System.currentTimeMillis() - timeSGet;

		long timeContainsSet = System.currentTimeMillis();
		for (int i = 0; i < NELEMENTOS; ++i) {
			s.contains(new Cubo(70, 70 * 5, 70 * 5 + 5));
		}
		timeContainsSet = System.currentTimeMillis() - timeContainsSet;

		it = s.iterator();
		long timeSRemove = System.currentTimeMillis();
		while (it.hasNext()) {
			it.next();
			it.remove();

		}
		timeSRemove = System.currentTimeMillis() - timeSRemove;

		System.out.println("Tempo para adicionar elementos em ArrayList:          " + timeAlAdd + "ms");
		System.out.println("Tempo para adicionar elementos em LinkedList:         " + timeLlAdd + "ms");
		System.out.println("Tempo para adicionar elementos em Stack:              " + timeStAdd + "ms");
		System.out.println("Tempo para adicionar elementos em Set:                " + timeSAdd + "ms");
		System.out.println("Tempo para remover elementos em ArrayList:            " + timeAlRemove + "ms");
		System.out.println("Tempo para remover elementos em LinkedList:           " + timeLlRemove + "ms");
		System.out.println("Tempo para remover(pop) elementos em Stack:           " + timeStPop + "ms");
		System.out.println("Tempo para remover elementos em Set:                  " + timeSRemove + "ms");
		System.out.println("Tempo para ler elementos em ArrayList:                " + timeAlGet + "ms");
		System.out.println("Tempo para ler elementos em LinkedList:               " + timeLlGet + "ms");
		System.out.println("Tempo para ler elementos em LinkedList(com iterador): " + timeLlGetIt + "ms");
		System.out.println("Tempo para ler elementos em Set:                      " + timeSGet + "ms");
		System.out.println("Tempo para merge ArrayList e LinkedList:              " + timeMergeAlLl + "ms");
		System.out.println("Tempo para disjoin ArrayList e LinkedList:            " + timeDisjoin + "ms");
		System.out.println("Tempo de contains em ArrayList:                       " + timeContainsAl + "ms");
		System.out.println("Tempo de contains em Set:                             " + timeContainsSet + "ms");

		// com isso fica evidente que para a leitura a melhor forma de
		// armazenamento de dados depende do objetivo:
		// -Para adicionar elementos, a diferença é mínima, sendo notável apenas
		// em operações críticas
		// -Para remover elementos, a diferença é notável: a ArrayList é a
		// perdedora, por trabalhar com alocação de memória a cada operação
		// -Para ler elementos, a diferença é grande, sendo maior o tempo para a
		// lista ligada, o que faz sentido pela forma de sua implementação sem
		// acesso aleatório
		// -Vale lembrar que o stack não tem boa leitura, já que remove os
		// elementos para lê-los
		// É importante ressaltar também a velocidade maior do set em achar um
		// elemento (contains)

	}

}
