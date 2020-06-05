package ProgramRound;

public class armstrong {
public static void main(String[] args) {
	
	method();
	
}


static void method() {
	int num=123;
	int temp;
	int sum=0;
	while(num>0) {
		temp=num%10;
		sum=sum+(temp*temp*temp);
		num=num/10;
	}
	
	System.out.println("sum="+sum);
}

}
