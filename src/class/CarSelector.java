// Car Selector

package Classes;
import java.util.Scanner;

public class CarSelector {	
	
	public static void main(String[] args) {
		
//***********************************************************************
		Cars BMW = new Cars("BMW", "Jeep", 'B', 4, 55000.0);
		Cars Benz = new Cars("Benz", "Limousine", 'B', 4, 30000.0);
		Cars Lambo = new Cars("Lambo","Supercar", 'A', 2, 40000.0);
		Cars Honda = new Cars("Honda", "SUV", 'C', 4, 70500.0);
		Cars Volkswagen = new Cars("Volkswagen", "Vintage", 'C', 2, 130000.0);
//***********************************************************************		
		
		System.out.println(BMW.getModel() + Benz.getModel());
		Scanner typeIn = new Scanner(System.in);
		System.out.println("What kind of car do you want?\n"
				+ "  Jeep\n"
				+ "  Limousine\n"
				+ "  Supercar\n"
				+ "  SUV\n"
				+ "  Vintage");
		String species = typeIn.next();
		if (species.equals("Jeep")) {
			System.out.println("We have a Jeep for you!");
		} else if (species.equals("Limousine")) {
			System.out.println("We have a Limousine for you!");
		} else if (species.equals("Supercar")) {
			System.out.println("The supercar is ready for you to ride.");
		} else if (species.equals("SUV")) {
			System.out.println("Take your family out with your new SUV this week!");
		} else if (species.equals("Vintage")) {
			System.out.println("Special car for the special one.");
		} else {
			System.out.println("Please make sure you enter the right word.");
		}
		typeIn.close();
		
		Scanner rangeIn = new Scanner(System.in);
		System.out.println("From A to C as it ranking from high to low. What price range would you preffer?");
		char range = (char) rangeIn.nextByte();
		
	}

}
