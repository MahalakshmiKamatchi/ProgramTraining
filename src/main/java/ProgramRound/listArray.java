package ProgramRound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class listArray {
	// Remove a duplicate Entry from the given array

	public static void main(String[] args) {
		removeDuplicate();


	}
	/**
	 *  HashSet will remove duplicates
		put in list,list in set-> cause set will accept collections only		

	 */
	static void removeDuplicate() {
		
		int[] arr= {10,10,20,30,30};

		List list=new ArrayList();
		//list.add(arr);

		for(int i:arr) {
			list.add(i);
			System.out.println("->"+i);
		}

		Set set=new HashSet(list);	
		System.out.println(set);


	}
	/**
	 * If 10 has duplicate, It will remove all the 10
	 */
	static void DisplayUniqueNumber() {
		
		int[] arr= {10,10,20,30,30};

		List list=new ArrayList();
		list.add(arr);

		for(int i:arr) {
			list.add(i);
			System.out.println("->"+i);
		}
		Set set=new HashSet(list);

		Iterator<Integer> it=set.iterator();
		if(it.hasNext()) {
			System.out.println("="+it.next());
		}
	}

	/**
	 * Another Method to remove dup
	 */
	static void removeDup() {
		
		int[] intarr= {10,10,20,30,40,50};
		List a=new ArrayList();

		for(int i:intarr) {
			a.add(i);
		}
		Set set=new HashSet(a);
		Integer[] ia=new Integer[set.size()];
		set.toArray(ia);
		System.out.println(Arrays.toString(ia));

	}

}
