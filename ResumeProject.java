package jpro;
import java.util.Scanner;
public class ResumeProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur name please...");
		String s = sc.nextLine();
		System.out.println("enter your mail please...");
		String mail = sc.nextLine();
		System.out.println("\n\t\t\t\t\t\t\t\t" + s + "\n\t\t\t\t\t\t\t" +"Gmail: "+ mail);
		System.out.println("how many techs do u want to enter ");
		int tech = sc.nextInt();
		for(int i = 1; i<tech;i++) {
			System.out.print("enter ur techs.");
			String tech1 = sc.nextLine();
			StringBuffer sb = new StringBuffer(tech1);
			System.out.print(sb);
		}
		
	}

}
