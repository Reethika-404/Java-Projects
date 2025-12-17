package jav;
import java.util.Scanner;
import java.util.Random;
public class VotingSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rc = new Random();
		
		System.out.print("please enter your name...");
		String name = sc.nextLine();
		
		System.out.print("please enter your age");
		int age = sc.nextInt();
		int bjpVotes = rc.nextInt(10);
		int congress = rc.nextInt(10);
		int AAP = rc.nextInt(10);
		int nota = rc.nextInt(10);
	
		if (age>=18) {
			System.out.print("you are eligible to vote...");
			System.out.print("enter your vote");
			sc.nextLine();
			String party = sc.nextLine();
			if (party=="BJP") {
				bjpVotes++;
			}
			else if(party=="congress") {
				congress++;
			}
			else if(party=="AAP") {
				AAP++;
			}
			else if(party=="nota") {
			    nota++;
			}
			
			if(bjpVotes>congress && bjpVotes>AAP && bjpVotes>nota)
			 {  
				System.out.print("BJP won by "+bjpVotes);
			      }
			else if(congress>bjpVotes && congress>AAP && congress>nota) {
				System.out.println("congress won by "+congress);
			}
			else if(AAP>bjpVotes && AAP>congress && AAP>nota) {
				System.out.println("AAP won by "+AAP);
			}
			else {
				System.out.print("nota won by"+nota);
			}
		}
	    else {
	    	System.out.println("sorry u are not eligible, these are the results");
	    	
	    }
			}
		
	}


