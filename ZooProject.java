package jpro;
class Zoo{
	public void Zooo() {
		System.out.println("This ia a zoo");
	}
}
class Zookeeper extends Zoo{
	public void work() {
		System.out.println("I work in this zoo");
	}
}
abstract class Animals{
	public void sleep() {
		System.out.println("zzz...");
	}
	public void sound() {
		System.out.println("sounding with respect to there features");
	}
}

class Lion extends Animals{
	public void hunt() {
		System.out.println("hunting animals");
	}
}
class Tiger extends Animals{
	public void cute() {
		System.out.println("I am just like a cat");
	}
}
class Birds {
	public void Fly() {
		System.out.println("I am flying, chuckk... chuckk...");
	}
}
class Sparrow extends Birds{
	public String Humm(String s) {
		s = "chucckk";
		System.out.println(s);
		return s;
	}
	public String Humm(String s1,String s2) {
			s1 = "chhhhh";
			s2 = "chick...";
			System.out.print(s1+" "+s2);
			return s1 + s2;
			}
	}

public class ZooProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b1 = new Birds();
		b1.Fly();
		Lion l1 = new Lion();
		l1.hunt();
		Sparrow s1 = new Sparrow();
		s1.Humm(null);
		s1.Humm(null, null);
		
	}

}
