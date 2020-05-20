package ProgramRound;

public class NumberCalculation {
private static char ch1;
private static char ch;

public static void main(String[] args) {
	String number="246889";
	
	int n=0;
for(int i=0;i<=number.length();i++) {
	ch=number.charAt(i);
	for(int j=1;j<=number.length();j++) {
		ch1=number.charAt(j);
		
		if(ch<=ch1) {
			n++;
						
		}
		else {
			n=-1;
		}
				
	}
		
}	
if (n!=-1) {
	for (int l=0;l<=number.length();l++) {
		for(int k=l+1;k<=number.length();k++) {
			if(ch==ch1) {
				System.out.println("Atleast one number is reapeated consequtively");
			}
		}
	}
	

}


}
}


