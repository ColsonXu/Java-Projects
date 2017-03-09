package clubRegisteration;

public class LogOn {

	private String realName;
	private String nickName;
	private static int memCount = 0;
	
	public LogOn(String rnm, String nnm) {
		realName = rnm;
		nickName = nnm;
		memCount++;
	}
	
}
