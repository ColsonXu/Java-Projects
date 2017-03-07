package Time;

public class Commander {

	public static void main(String[] args) {
		
		timeFormatConvertor time1 = new timeFormatConvertor();
		System.out.println(time1.toMilitary() + "\n" + time1.toNormal());
		time1.setTime(24, 28, 45);
		System.out.println(time1.toMilitary() + "\n" + time1.toNormal());

	}

}
