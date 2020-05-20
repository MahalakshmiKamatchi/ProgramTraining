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

	public static void main(String[] args) {
		num=142857;
		mul=2;
		int ans=num*mul;
		System.out.println(ans);

		intarr=new int[6];
		int temp=0;
		while(num>0) {
			int num1=num%10;
			intarr[temp]=num1;
			num=num/10;
			temp++;

		}

		intarr1=new int[6];
		int temp1=0;
		while(ans>0) {
			int num2=ans%10;
			intarr1[temp1]=num2;
			ans=ans/10;
			temp1++;

		}

		int tem=0;
		for(int j=0;j<intarr.length;j++) {
			for(int k=0;k<intarr1.length;k++) {
				if(intarr[j]==intarr1[k]) {
					tem++;
					break;
				}		
			}
		}
		if(tem==6) {
			System.out.println(tem);
			System.out.println("same numbers");
		} //it may not work when num like 123333, ans like 123456.


		//////////////////////
		//2ND METHOD
		int n=142857;
		int a=n*mul;
		String s1=String.valueOf(n);
		String s2=String.valueOf(a);
		System.out.println(a);

		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		//sub method 1
		
		String stringofa1 = Arrays.toString(a1);
		System.out.println("stringofa1"+stringofa1);
		String stringofa2 = Arrays.toString(a2);
		System.out.println("stringofa2"+stringofa2);
		
		if(stringofa1.contentEquals(stringofa2)) {
			System.out.println("mirroring");
		}
		
		//---------------------
		
		//sub method 2
		
		String sort1="";
		String sort2="";



		for(char i:a1) {
			sort1=sort1+i;
			System.out.println("i"+i);
		}
		
		for(char j:a2) {
			sort2=sort2+j;
			System.out.println("j"+j);
		}
if(sort1.equals(sort2)) {
	System.out.println("mirror");
}
	}
}




