package Classes;
import java.util.Scanner;


public class ap_cs {
	
	int easeLevel;
	
	public ap_cs(int homeworkLoad) {
		easeLevel = homeworkLoad;
	}
	
	public int getEaseLevel() {
		return easeLevel;
	}

	public static void easeLevel(int homeworkLoad) {
		if (homeworkLoad > 3){
			System.out.println("This course is very hard for you.");
		} else if (homeworkLoad == 3){
			System.out.println("You seems to be doing just fine.");
		} else {
			System.out.println("You are in the wrong class.");
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("From scale of 1 to 5, how would you rate the homework load of this course? ");
		int homeworkLoad = input.nextInt();
		ap_cs.easeLevel(homeworkLoad);
	}

}
