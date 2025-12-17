package jpro;
import java.util.Scanner;
public class UsernameProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s.toLowerCase());
		
		
				String su = s.replaceAll("[aeiou]", "");
				
			
		System.out.print(su.toLowerCase().replace(" ", "."));
		}
	}


