
public class SwapCharTdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String last2char(String str) {
		// TODO Auto-generated method stub

		int strLength = str.length();
		char second2LastOne = str.charAt(strLength - 2);
		char lastOne = str.charAt(strLength - 1);
		
		if (strLength < 2) {
			return str;
		}else if(strLength ==  2){
			return "" + lastOne + second2LastOne;
		}

		else if(strLength ==  3){
		char firstChar = charAt(0);
			return "" + firstChar + lastOne + second2LastOne;
		}else if(strLength ==  4){
		char firstChar = charAt(0);
		char secondChar = charAt(1);
		
			return "" + firstChar + secondChar + lastOne + second2LastOne;
		}else {
			return "" + lastOne + second2LastOne;
		}

		

			}

	private static char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}
