package Human;

public class Human {
	private String name;
	private int age;
	
	public Human() {
		name = "";
		age = 0;
	}
	
	public Human(String nm, int ag) {
		name = nm;
		age = ag;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public String toString() {
		return "Human: " + name + ", Age: " + age;
	}
	
}
