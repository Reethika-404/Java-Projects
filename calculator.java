package jpro;

public class calculator {

	public static void main(String[] args) {
		System.out.println("Addition: "+add(3,3));
		System.out.println("Substraction: "+sub(3,3));
		System.out.println("Multiplication: "+mul(2,3));
		System.out.println("Division: "+div(6,2));
	}
	   public static int add(int num1,int num2) {
		   return num1+num2;
	   }
	   public static int sub(int num1,int num2) {
		   return num1-num2;
	   }
	   public static int mul(int num1,int num2) {
		   return num1*num2;
	   }
	   public static int div(int num1, int num2) {
		   return num1/num2;
	   }
}
