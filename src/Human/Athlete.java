package Human;

public class Athlete extends Human {
	private String sport;
	private static int count = 0;
	
	public Athlete() {
		super();
		sport = "";
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	/**
	 * @param nm Name of the athlete.
	 * @param ag Age of the athlete.
	 * @param s  Sport the athlete plays.
	 */
	
	public Athlete(String nm, int ag, String s) {
		super(nm, ag);
		sport = s;
	}
	
	
	/**
	 * @return Returns what kind of sport the athlete plays.
	 */
	
	public String getSport() {
		return sport;
	}
	
	
	/**
	 * @param s Set the new kind of sport the athlete plays.
	 */
	
	public void setSport(String s) {
		sport = s;
	}
	

//The defalt method called whenever the object name is returned
//or printed without any specific method.
	
	public String toString() {
		return "Athlete: " + super.getName() + ", Sport: " + sport;
	}
}
