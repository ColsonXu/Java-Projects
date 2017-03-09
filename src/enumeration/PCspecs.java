package enumeration;

public enum PCspecs {
	
	SurfacePro("Surface Pro 4", "2 in 1", 10000),
	Precision5510("Precision 5510", "Mobile Workstation", 20000),
	MacBookPro("MacBook Pro", "Laptop", 18000);
	
	private final String NAME;
	private final String TYPE;
	private final int PRICE;
	
	PCspecs(String nm, String tp, int prc) {
		NAME = nm;
		TYPE = tp;
		PRICE = prc;
	}
	
	public String getName() {
		return NAME;
	}
	
	public String getType() {
		return TYPE;
	}
	
	public int getPrice() {
		return PRICE;
	}
}
