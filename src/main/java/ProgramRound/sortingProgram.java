package ProgramRound;

import java.util.Arrays;

public class sortingProgram {
	public static void main(String[] args) {
		//bubbleSort();
		selectionSort1();
		//insertionSort();
		
	}

	/**
	 * BubbleSort
	 */
	static void bubbleSort(){
		int[] arr= {1,2,3,7,6};
		int temp;

		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	/**
	 * Arranging values based on value like bubble sort
	 * will last in descending order
	 */
	
	static void selectionSort1() {
		int[] arr= {1,2,9,7,6};

		for (int i = 0; i < arr.length - 1; i++)  
		{  
			for (int j = i + 1; j < arr.length; j++){  
				if (arr[i] > arr[j]){  
					int smallerNumber = arr[i];   
					arr[i] = arr[j];  
					arr[j] = smallerNumber;
				}  
			}  
		}  

		for(int i:arr){  
			System.out.print(i+" ");  
		}

	}

	/**
	 * Arranging values based on index
	 * will last in ascending order
	 */
	static void selectionSort2() {
		int[] arr= {1,2,9,7,6};

		for (int i = 0; i < arr.length - 1; i++)  
		{  
			int index = i; 
			System.out.println("index= "+index);

			for (int j = i + 1; j < arr.length; j++){  
				if (arr[j] < arr[index]){  
					index = j;//searching for lowest index  
				}  
			}  
			int smallerNumber = arr[i];   
			arr[i] = arr[index];  
			arr[index] = smallerNumber;

		}  

		for(int i:arr){  
			System.out.print(i+" ");  
		}  
	}

	static void insertionSort() {
		int[] arr= {1,2,9,7,6};
		 
        for (int j = 1; j < arr.length; j++) {            
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > arr[j] ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = arr[j];  
        }       
        
        
        for(int i : arr) {
        	System.out.println(arr[i]);
        }
	}
	
	

}
