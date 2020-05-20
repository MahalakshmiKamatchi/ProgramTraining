package ProgramRound;



public class Array {
	//static int num=234566;
	//static String a="jhdgf";
	private static int[]  arr;
	private static int temp;
	private static int a;
	static int n=0;
	
	
public static void main(String[] args) {
	method(234456);
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

void method1(int number){
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
