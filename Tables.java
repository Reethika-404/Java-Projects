package jpro;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number...");
		int x = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(x+"x"+i+"="+x*i);
		}
	}

}
