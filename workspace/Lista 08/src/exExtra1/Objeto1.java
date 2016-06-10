package exExtra1;

import java.util.*;

public class Objeto1 {
	int n;
	private static final int NUM = 10;
	Objeto1(int n){
		this.n = n;
	}
	public void print1 (String threadName){
		System.out.println(threadName + ": " + n);
	}
	public static void main (String args[]){
		LinkedList<Objeto1> l = new LinkedList<>();
		for (int i = 0; i < 100; ++i){
			l.add(new Objeto1(i));
		}
		
		ArrayList<Threads> a = new ArrayList<>(NUM);
		for (int i = 0; i < NUM; ++i){
			a.add(new Threads(l.iterator(), "t" + Integer.toString(i)));
		}
		for (int i = 0; i < NUM; ++i){
			a.get(i).start();
		}
		
		//
		
		
	}
}
