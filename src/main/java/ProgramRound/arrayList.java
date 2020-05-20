package ProgramRound;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
public static void main(String[] args) {
	ArrayList<Integer> ai=new ArrayList<Integer>();
	ai.add(10);
	ai.add(100);
	ai.add(0, 90);
	
	
	System.out.println(ai.size());
	ArrayList<Integer> aa=new ArrayList<Integer>();
	aa.addAll(ai);
	aa.set(0, 70);
	System.out.println(aa);
	
	Iterator<Integer> i=ai.iterator();
	while(i.hasNext()) {
		System.out.println("the values are if " + i +" is "+ i.next());
	}
		
	
}
}
