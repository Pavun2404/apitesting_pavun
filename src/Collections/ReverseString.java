package Collections;

public class ReverseString {
	public static void main(String[] args) {
		String a="I Love Programs Writing";
		
		String b[]=a.split(" ");
		
		for(int i=b.length-1;i>0;i--) 
		{
			System.out.print(b[i]);
		}
	}

}
