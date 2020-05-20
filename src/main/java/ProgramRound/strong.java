package ProgramRound;

public class strong {
public static void main(String[] args) {
	int num=123;
	int temp=1;
	int sum=1;
	
	while(num!=0) {
		temp=num%10;
		sum=sum+fact(temp);
		num=num/10;
	}
	System.out.println(sum);
	
	String result= (temp==sum)?"Strong number":"Not a strong number";
	System.out.println(result);

}
static int fact(int temp){
	int sum1=1;
	
	
	while(temp!=1) {
		sum1=sum1*temp--;	
	}
	return sum1;
	
}



}
