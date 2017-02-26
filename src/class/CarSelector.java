// Car Selector

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


		while (true) {
			Scanner typeIn = new Scanner(System.in);
			System.out.println("What kind of car do you want?\n"
					+ "  Jeep\n"
					+ "  Limousine\n"
					+ "  Supercar\n"
					+ "  SUV\n"
					+ "  Vintage");
			String species = typeIn.next();
			if (species.equals("Jeep") || species.equals("Limousine") || species.equals("Supercar") || species.equals("SUV") || species.equals("Vintage")) {
				System.out.println(species);
				typeIn.close();
				break;
			} else {
				System.out.println("Please make sure you enter the right type.");
				typeIn.close();
			}
		}
		
		
			Scanner rangeIn = new Scanner(System.in);
			System.out.println("From A to C as it ranking from high to low. What price range would you preffer?");
			char range = (char) rangeIn.nextByte();
		
		}

	}

}
