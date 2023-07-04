package Collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetNameAndAge {

	public static void main(String[] args) {
//		        String inputString = "PavunKumar28";
//
//		        // Extract the first name (assuming it consists of alphabetic characters only)
//		        String firstName = inputString.replaceAll("[^A-Za-z]", "");
//
//		        // Extract the age (assuming it consists of numeric characters at the end of the string)
//		        String ageString = inputString.replaceAll("[^0-9]", "");
//		        int age = Integer.parseInt(ageString);
//
//		        System.out.println("First name: " + firstName);
//		        System.out.println("Age: " + age);
		    

		
		
		
		
		
		        String inputString = "Pavun Kumar 28";

		        // Extracting the first name
		        String firstName = inputString.split(" ")[0];

		        // Extracting the age
		        Pattern agePattern = Pattern.compile("\\d+");
		        Matcher matcher = agePattern.matcher(inputString);
		        int age = -1;
		        if (matcher.find()) {
		            age = Integer.parseInt(matcher.group());
		        }

		        // Printing the results
		        System.out.println("First name: " + firstName);
		        System.out.println("Age: " + age);
		    }
		}

	


