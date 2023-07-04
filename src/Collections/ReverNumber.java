package Collections;

public class ReverNumber {

	public static void main(String[] args) {
		int givenNumber = 456;
		int reverseNumber = 0;
		
		while(givenNumber!=0) {
		reverseNumber = reverseNumber*10;
		reverseNumber = reverseNumber+givenNumber%10;
		givenNumber = givenNumber/10;
	}
		System.out.println("Reversed Number is :" + reverseNumber);
	}
}
