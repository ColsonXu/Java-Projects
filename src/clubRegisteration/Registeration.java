package clubRegisteration;

public class Registeration {

	public static void main(String[] args) {
		NewMember mem1 = new NewMember("Bob", "hehehe12138");
		System.out.println(mem1.getNickName() + "'s real name is " + mem1.getRealName());
		System.out.println("Total members in the club: " + NewMember.getCount());
	}

}
