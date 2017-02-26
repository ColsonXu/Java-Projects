package Classes;

public class Cars extends CarSelector {

	String model;
	char priceRange;
	int numberOfDoors;
	double mileAge;
	String type;
	
	Cars(String name, String species, char range, int doors, double miles) {
		model = name;
		type = species;
		priceRange = range;
		numberOfDoors = doors;
		mileAge = miles;
	}

	public String getModel() {
		return model;
	}

}
