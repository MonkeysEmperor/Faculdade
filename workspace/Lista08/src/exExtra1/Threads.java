package exExtra1;

import java.util.Iterator;

public class Threads extends Thread {
	Iterator<Objeto1> i;
	String name;
	public Threads (Iterator<Objeto1> i, String threadName){
		this.i = i;
		name = threadName;
	}
	
	@Override
	public void run (){
		while (i.hasNext()){
			i.next().print1(name);
		}
	}
	
}
