package Collections;

public class RemoveDuplicateCharaters {
	public static void main(String[]args) {
		
		String str = "Pavunkumar";
		
		// *********#1 - Java 8 method**********
		StringBuilder b = new StringBuilder();
		str.chars().distinct().forEach(c -> b.append((char)c));
		System.out.println(b);
		
		//*********#2 - characterArray method *********
		char[] arr = str.toCharArray();
		StringBuilder b1 = new StringBuilder();
		for(int i =0; i<str.length();i++) {
			boolean repeated = false;
			for(int j= i+1; j<str.length();j++) {
				if(arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				b1.append(arr[i]);
			}
		}
		System.out.println(b1);
	}

}
