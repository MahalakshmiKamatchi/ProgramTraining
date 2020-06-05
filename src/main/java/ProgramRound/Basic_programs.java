package ProgramRound;

import java.util.Scanner;

public class Basic_programs {
	public static void main(String[] args) {
		//fibonacci();
		//prime();
		//checkPalindromeString();
		checkPalindromeInt();
		
	}
	static void fibonacci() {
		int n1=0, n2=1,sum;

		System.out.println(n1+""+n2);
		while(n1<10){
			sum=n1+n2;
			System.out.println(""+sum);
			n1=n2;
			n2=sum;

		}		
	}

	static void prime() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number first number ");
		int start=scan.nextInt();
		
		System.out.println("Enter Number Last number ");
		int end=scan.nextInt();
		int flag=0;
		for (int i = start; i <= end; i++) {  
			if (i <= 1) {  
		           System.out.println("No prime");
		       }  
		       for (int j = 2; j <= Math.sqrt(i); j++) {  
		           if (i % j == 0) {  
		        	   System.out.println(i+ " is No prime");
		        	   flag++;
		        	   break;
		           } 
		           
		       }
		       if(flag==0) {
		    	   System.out.println(i+ " Prime");
		       }
		        
	       }  
	   } 
	
	static void checkPalindromeString() {
		
		String start="NIVIN";
		
		String str=""; 
		
		for(int i=start.length()-1;i>=0;i--) {
			char ch=start.charAt(i);
			str=str+ch;
		}
		System.out.println(str);
		if(str.contentEquals(start)) {
			System.out.println("palindrome");
		}else {
			System.out.println("No Palindrome");
		}
		
		
	}
	
static void checkPalindromeInt() {
		
		int n=434, temp=0, sum=0, digitIncrement=1;
		
		while(n>0) {
			temp=n%10;
			sum=sum+(temp*digitIncrement);
			System.out.println(sum);
			n=n/10;
			digitIncrement=digitIncrement*10;
		}
		
	}
	
	
	
}


