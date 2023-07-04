package Collections;

public class LargestNumber {
	public static void main(String[] args) {
		int a[] = {1,2,3,54,6,78,457,376,8364};
		int largest = a[0];
		
		for(int num:a) {			
			if(largest < num) 
			largest=num;
			}
			System.out.println("Largest number from given array is:" +largest);
		}
	}

