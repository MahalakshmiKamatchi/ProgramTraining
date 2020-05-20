package ProgramRound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class listArray {
	// Remove a duplicate Entry from the given array
public static void main(String[] args) {
	int[] intarr= {10,10,20,30,40,50};
	
	// put in list,list in set-> cause set will accpt colloections only. 
	//Then create integer, string kinda array and put set's object into it.
	// now u can use arrays's tostring option.
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
