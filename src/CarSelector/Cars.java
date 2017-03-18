package CarSelector;

public class Cars extends CarSelector {

	private String model;
	private char priceRange;
	private int numberOfDoors;
	private double mileAge;
	private String type;
	private static int Count;
	
	Cars(String name, String species, char range, int doors, double miles) {
		model = name;
		type = species;
		priceRange = range;
		numberOfDoors = doors;
		mileAge = miles;
		Count++;
	}

	public String getModel() {
		return model;
	}

	public char getPriceRange() {
		return priceRange;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public double getMileAge() {
		return mileAge;
	}

	public String getType() {
		return type;
	}

	public static int getCount() {
		return Count;
	}

}
