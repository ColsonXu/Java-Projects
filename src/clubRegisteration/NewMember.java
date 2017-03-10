package clubRegisteration;

public class NewMember {

	private String realName;
	private String nickName;
	private static int memCount = 0;
	
	public NewMember(String rnm, String nnm) {
		realName = rnm;
		nickName = nnm;
		memCount++;
		System.out.println("New member " + nickName + " is the " + memCount + " member in our club!");
		
	}
	
	
	public String getRealName() {
		return realName;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public static int getCount() {
		return memCount;
	}
}
