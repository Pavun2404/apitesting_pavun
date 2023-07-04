package Collections;

public class Palidrome {

	public static void main(String[]args) {
		int num = 1213;
//		int reverseNum = 0;
//		int originalNum = num;
//		int reminder;
//		
//		while(num!=0) {
//			reminder = num%10;
//			reverseNum = reverseNum*10+reminder;
//			num = num/10;
//		}
//		if(originalNum==reverseNum) {
//			System.out.println("Given Number is Palidrome");
//		}
//		else {
//			System.out.println("Given number is not palidrome");
//		}
//		
		String s = "aba";
		String rev = "";
		int strLength =s.length();
		
		for(int i=s.length()-1;i>=0;--i) {
			rev = rev+s.charAt(i);		
		}
		if(s.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("Given string is palidrome");
		}
		else {
			System.out.println("Given string is not a palidrome");
		}
		

	}
}
