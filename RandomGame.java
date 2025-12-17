package jpro;
import java.util.Scanner;
import java.util.Random;
public class RandomGame{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rs = new Random();
		int x = rs.nextInt(10);
		int y=0;
		System.out.print("Guess your number please...");
		while(x!=y) {
			int attempt = sc.nextInt();
			if(attempt == x) {
				System.out.println("congrtas u got it correct");
			}
			else if(attempt<x) {
				System.out.println("low");
			}
			else if(attempt>x){
				System.out.println("high");
			}
		}
	}
}