package SCD;

public class Calculator {
    int a, b;
    public int add(int a, int b) {
	return a+b;
    }
    public int div(int a, int b) {
   	return a/b;
       }
    public int mul(int a, int b) {
   	return a*b;
       }
   
    public static void main(String[] args) {
	
	Calculator c = new Calculator();
	System.out.println("Desired Result of addition is " +c.add(2, 4) );
	System.out.println("Desired Result of division is " +c.div(4, 5) );
	System.out.println("Desired Result of multiplication is " +c.mul(3, 3) );
	
    }

}
