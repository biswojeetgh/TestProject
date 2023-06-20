
public class ArrayTest {
	public static boolean Array(int[] array, int minRange, int maxRange) {
        
		 for (int element : array) {
		 if (element < minRange || element > maxRange) {
		 return false; 
		   }
		 }
		        
		 return true;
		 }
		    
		 public static void main(String[] args) {
		  int[] array1 = {1, 2, 3, 4, 5};
		  int[] array2 = {1, 2, 3, 4, 6};
		        
		   int minRange = 1;
		   int maxRange = 5;
		        
		    boolean isVerified1 = Array(array1, minRange, maxRange);
		    boolean isVerified2 = Array(array2, minRange, maxRange);
		        
		        System.out.println("Array 1 is verified: " + isVerified1);
		        System.out.println("Array 2 is verified: " + isVerified2);
		    }
}
