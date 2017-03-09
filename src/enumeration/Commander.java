package enumeration;

public class Commander {

	public static void main(String[] args) {
		
		for (PCspecs name : PCspecs.values()) {
			System.out.printf("The %s is a %s, it costs %sRMB.", name.getName(), name.getType(), name.getPrice());
			System.out.println();
		}
		
	}

}
