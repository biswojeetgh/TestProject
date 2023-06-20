
class MyClass{
	public void publicMethod() {
		System.out.println("This is a public method.");
	}
	private void privateMethod() {
		System.out.println("This is a private method.");	
	}
	protected void protectedMethod() {
		System.out.println("This is a protected method.");
	}
	void defaultMethod() {
		System.out.println("This is a default method.");
	}
		
}
public class AccessModifier {
	public static void main(String args[]) {
		MyClass ob=new MyClass();
		ob.publicMethod();
		//ob.privateMethod();//not accessible outside the class
		ob.protectedMethod();
		ob.defaultMethod();
		
	}
}
