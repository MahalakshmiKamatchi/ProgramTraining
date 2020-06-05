package ProgramRound;

public class factorial {

	public static void main(String[] args) {
		
		int num=4;
		int temp=1;

		while(num!=1) {
			temp=temp*num;
			num--;
		}

		System.out.println(temp);
	}

	static void method(){
		int num=4;
		int temp=1;
		while(num>0) {
			temp=temp*num--;
		}
		System.out.println("factorial of 4 is "+temp);
	}

}
