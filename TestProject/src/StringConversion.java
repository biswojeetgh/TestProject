
public class StringConversion {
	public static void main(String args[]) {
		String originalString="Hello, i am Biswojeet.";
		StringBuffer sbf=new StringBuffer(originalString);
		StringBuilder sbl=new StringBuilder(originalString);
		System.out.println("Original String:"+originalString);
		System.out.println("StringBuffer:"+sbf.toString());
		System.out.println("StringBuilder:"+sbl.toString());
		
	}
}
