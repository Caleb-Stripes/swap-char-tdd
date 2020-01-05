
public class SwapCharTdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String last2char(String str) {
		// TODO Auto-generated method stub
		
		int strLength = str.length();
		
		char second2LastOne = str.charAt(strLength - 2);
		char lastOne = str.charAt(strLength - 1);
		
		return "" + lastOne + second2LastOne;
	}
}