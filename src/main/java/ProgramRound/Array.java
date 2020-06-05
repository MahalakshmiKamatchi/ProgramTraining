package ProgramRound;



public class Array {
	//static int num=234566;
	//static String a="jhdgf";
	private static int[]  arr;
	private static int temp;
	private static int a;
	static int n=0;
	static int num;


	public static void main(String[] args) {
		checkAdjacentCharacterString();
		//checkAdjacentNumberSameCharArray();
		//checkAdjacentNumberSame();
		//howManySameIndividualsInNumber();
		//createArray();
		//method(234456);
	}

	/**
	 *check count of each individual number in the whole number
	 *ex: 1233334455
	 *how many 1s are in the above , how many 2s are in the above. 
	 */

	static void howManySameIndividualsInNumber(){

		num=12334455;
		int numFroCount=num;
		int counter=0;

		while (numFroCount>0) {
			int temp=numFroCount%10;
			counter++;
			numFroCount=numFroCount/10;

		}
		System.out.println(counter);

		int[] arr = new int[counter];
		int i=0;
		int temp=0;
		while(i<counter) {
			temp=num%10;
			arr[i]=temp;
			System.out.println("array of "+ i +" = "+arr[i]);
			num=num/10;
			i++;

		}


		for(int l=0;l<counter;l++) {
			int counting=0;	
			for(int m=0;m<counter;m++) {
				if(arr[l]==arr[m]) {				
					counting++;				
				}			
			}
			System.out.println("Total count of "+arr[l]+" in this number is "+counting);
			if (counting>1) {
				//System.out.println(arr[l]+" is more than 1 time");
			}
		}

	}

	/**
	 * Add numbers in array
	 */
	static void createArray(){
		int[] arr1=new int[5];
		int z=1;
		for(int i=0;i<5;i++) {
			arr1[i]=z;
			z++;
			System.out.println("array of "+ i +" = "+arr1[i]);
		}
	}

	/**
	 * Check if the adjacent numbers of individual is same
	 * @param num
	 */
	static void checkAdjacentNumberSame(){
		int number=122233556;
		int doupNumber=number;
		int counter=0;
		while(doupNumber>0) {
			int temp=doupNumber%10;
			counter++;
			doupNumber=doupNumber/10;
		}
		System.out.println("-->"+counter);
		int[] array=new int[counter];
		int i=0;
		int temp=0;
		while(i<counter) {
			temp=number%10;
			array[i]=temp;
			number=number/10;
			i++;
		}

		for(int a=0;a<counter;a++) {
			int counters=1;
			for(int b=0;b<counter;b++) {
				if(b==a+1 || b==a-1) {
					if(array[a]==array[b]) {
						counters++;
					}
				}
			}
			if(counters>1) {
				System.out.println("Adjacent numbers are same for "+ array[a] );
			}
			else {
				System.out.println("No same adjacent number for "+ array[a] );
			}

		}

	}

	/**
	 *  Instead of adding array by while loop using char array
	 *  Converting the int into string
	 * @param number
	 */
	static void checkAdjacentNumberSameCharArray() {
		int number=122233556;
		int doupNumber=number;
		int counter=0;
		while(doupNumber>0) {
			int temp=doupNumber%10;
			counter++;
			doupNumber=doupNumber/10;
		}
		
		String str=String.valueOf(number);
		
		char[] ch1=str.toCharArray();
				
		for(int a=0;a<counter;a++) {
			int counters=1;
			for(int b=0;b<counter;b++) {
				if(b==a+1 || b==a-1) {
					if(ch1[a]==ch1[b]) {
						counters++;
					}
				}
			}
			if(counters>1) {
				System.out.println("Adjacent numbers are same for "+ ch1[a] );
			}
			else {
				System.out.println("No same adjacent number for "+ ch1[a] );
			}

		}
		
		
	}
	
	/**
	 *  Instead of adding array by while loop using char array
	 *  Converting the int into string
	 * @param number
	 */
	static void checkAdjacentCharacterString() {
		String value="aaserttyujjll";
		char[] ch1=value.toCharArray();
		
		int counter=1;
		for(int i=1; i<value.length();i++) {
			counter++;
		}System.out.println("counter = "+counter);
			
		for(int a=0;a<counter;a++) {
			int counters=1;
			for(int b=0;b<counter;b++) {
				if(b==a+1 || b==a-1) {
					if(ch1[a]==ch1[b]) {
						counters++;
					}
				}
			}
			if(counters>1) {
				System.out.println("Adjacent numbers are same for "+ ch1[a] );
			}
			else {
				System.out.println("No same adjacent number for "+ ch1[a] );
			}
		}	
		
	}
	

	static void method(int num){
		System.out.println("heuheih");
		temp=0;
		a =0;

		while(a<6) {		
			temp=num%10;
			arr=new int[6];
			arr[a]=temp;
			num=num/10;
			a++;

		}

		for(int i=0; i>=arr.length;i++) {
			System.out.println(arr[i]);
		}

		for(int i=0;i<=arr.length;i++) {
			int same=0;
			for(int j=i+1; i<=arr.length;j++) {
				int a=arr[i];
				int b=arr[j];

				//int c=arr[i+1];
				if(a < b) {
					System.out.println("Its not in ascending order");
					n++;
					break;
				}
				if(a==b) {
					same++;

				}

			}	
		}
		System.out.println("adjacent numbers are same here for count "+ n);
	}

	
	
	static void method1(int number){
		String a=String.valueOf(number);
		char[] c=a.toCharArray();
		int tempp=0;
		for(int i=0; i<=c.length;i++) {
			for(int j=i+1; j<=c.length;j++ ) {
				if(c[i]>c[j]) {
					break;
				}
				if(c[i]==c[i+1]) {
					tempp++;
				}
			}
		}
	}
	

}
