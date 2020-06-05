package ProgramRound;

import java.util.Arrays;

public class digitCheck {

	/**
	 * Check when multiplying a 6 digit number with 2 gives a number 
	 * which has all the same numbers. E.g: 142857 x 2 = 285714
	 */

	// 1ST METHOD

	private static int[] intarr;
	private static int[] intarr1;
	private static int num;
	private static int mul;
	private static int w=10;

	public static void main(String[] args) {
		UsingbubbleSort();
		//UsingArraysMethod();			
	}
	/**
	 * Arrays usage Simplest to compare the answer 
	 * int to string & String to  char array & using Arrays options for char array
	 */
	static void UsingArraysMethod() {
		int m=143256;
		int n=123456;

		String ms=String.valueOf(m);
		String ns=String.valueOf(n);

		char[] ch1=ms.toCharArray();
		char[] ch2=ns.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String mt=Arrays.toString(ch1);
		System.out.println("mt-->"+mt);
		String nt=Arrays.toString(ch2);
		System.out.println("nt-->"+nt);

		if(mt.contentEquals(nt)) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}

	}

	/**
	 * Arrays usage Simplest to compare the answer 
	 * int to string & String to  char array & using for options to get every string
	 */
	static void UsingForMethod() {
		int m=143256;
		int n=123456;

		String ms=String.valueOf(m);
		String ns=String.valueOf(n);

		char[] ch1=ms.toCharArray();
		char[] ch2=ns.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String sort1="";
		String sort2="";
		for(char i:ch1) {
			sort1= sort1+i;
		}
		for(char j:ch2) {
			sort2= sort2+j;
		}

		if(sort1.equals(sort2)) {
			System.out.println("mirroring");
		}else {
			System.out.println("Not mirroring");
		}

	}

	static void UsingbubbleSort(){
		num=142257;
		mul=2;
		int ans=142576;

		intarr=new int[6];
		int temp=0;
		while(num>0) {
			int num1=num%10;
			intarr[temp]=num1;
			num=num/10;
			temp++;

		}
		
		for(int i=0; i < intarr.length; i++){  
			for(int j=1; j < intarr.length-i; j++){  
				if(intarr[j-1] > intarr[j]){  
					//swap elements  
					temp = intarr[j-1];  
					intarr[j-1] = intarr[j];  
					intarr[j] = temp;  
				}  

			}  
		} 
		
		String sort="";
		for(int i: intarr) {
			sort=sort+i;
		}
System.out.println("sort=>"+sort);

	}




}




