package ProgramRound;

public class constructorArray {

	String empName;
	String empId;

	
	/**
	 * Creating own array via constructor (we can't do with methods)
	 * @param empName
	 * @param empId
	 */
	constructorArray(String empName, String empId){
		this.empName=empName;
		this.empId=empId;
	}


	public static void main(String[] args) {
		createConstructorArray();

	}

	static void createConstructorArray() {

		constructorArray[] arrs=new constructorArray[5];
		arrs[0]= new constructorArray("hey","hello");

	}


}

