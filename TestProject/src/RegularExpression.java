import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static boolean verifyRegex(String input, String regex) {
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(input);
	        
	     return matcher.matches();
	  }
	    
	public static void main(String[] args) {
	     String input1 = "Hello, World!";
	     String input2 = "12345";
	     String regex1 = "^[A-Za-z\\s]+$";
	     String regex2 = "^\\d+$";
	        
	boolean isVerified1 = verifyRegex(input1, regex1);
	boolean isVerified2 = verifyRegex(input2, regex2);
	        
	    System.out.println("Input 1 matches regex 1: " + isVerified1);
	    System.out.println("Input 2 matches regex 2: " + isVerified2);
	    }
}
