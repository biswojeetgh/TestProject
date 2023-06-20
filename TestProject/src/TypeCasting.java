
public class TypeCasting {
	public static void main(String[] args) {
	    //Implicit Type Casting
		int intValue=15;
		long longValue=intValue;
		System.out.println("Implicit Type Casting:");
		System.out.println("int value:"+intValue);
		System.out.println("long value:"+longValue);
		//Explicit Type casting
		double doubleValue=15.5;
		int intVal=(int) doubleValue;
		System.out.println("Explicit Type Casting:");
		System.out.println("double value:"+doubleValue);
		System.out.println("int value:"+intVal);
		

		}
}
