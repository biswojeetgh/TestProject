
public class MethodCalling {
	//method with no parameter no return value
		public static void greet() {
			System.out.println("Hello, I am Biswojeet");
		}
		//method with parameter with return value
		public static int addNumber(int a,int b) {
			return a+b;
		}
		public static void main(String args[]) {
			greet();
			//calling  the method by storing value.
			int result=addNumber(7,8);
			System.out.println("The addition of two number is:"+result);
			//calling the addNumber() method directly in a print statement.
			System.out.println("The addition of two number is:"+addNumber(5,3));
			//calling the addNumber() method with variable as argument.
			int x=5,y=5;
			int sum=addNumber(x,y);
			System.out.println("The sum of two number is:"+sum);
		}
}
