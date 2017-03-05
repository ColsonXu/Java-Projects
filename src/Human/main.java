package Human;

public class main {

	public static void main(String[] args) {
		Human h = new Human("Bob", 17);
		System.out.println(h);
		Athlete a = new Athlete("Mike", 28, "Running");
		System.out.println(a);
		a.setSport("Swimming");
		System.out.println(a);
	}

}
