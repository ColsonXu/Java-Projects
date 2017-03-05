package Human;

public class Athlete extends Human {
	private String sport;
	
	public Athlete() {
		super();
		sport = "";
	}
	
	public Athlete(String nm, int ag, String s) {
		super(nm, ag);
		sport = s;
	}
	
	public String getSport() {
		return sport;
	}
	
	public void setSport(String s) {
		sport = s;
	}
	public String toString() {
		return "Athlete: " + super.getName() + ", Sport: " + sport;
	}
}
