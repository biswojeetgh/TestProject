
class OuterClass {
    private int outerField;

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    public void outerMethod() {
        System.out.println("Outer method");
        InnerClassTest inner = new InnerClassTest();
        inner.innerMethod();
    }

public class InnerClassTest {
	 public void innerMethod() {
         System.out.println("Inner method");
         System.out.println("Outer field value: " + outerField);
     }
 }

 public static void main(String[] args) {
     OuterClass outer = new OuterClass(42);
     outer.outerMethod();
 }
}
