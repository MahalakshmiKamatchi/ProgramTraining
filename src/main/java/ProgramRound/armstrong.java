package ProgramRound;

public class armstrong {
public static void main(String[] args) {
	int num=123;
	int temp=1;
	int sum=1;
	while(num!=0) {
		temp=(num%10);
		sum=sum+(temp*temp*temp);
		num=num/10;
	}
	System.out.println(sum);
}
}
