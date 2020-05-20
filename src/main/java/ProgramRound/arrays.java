package ProgramRound;

public class arrays {
	
	String empName;
	String empId;
	
	arrays(String empName, String empId){
		this.empName=empName;
		this.empId=empId;
	}
	
	
public static void main(String[] args) {

    arrays[] arrs=new arrays[5];
    arrs[0]= new arrays("hey","hello");

}

}

