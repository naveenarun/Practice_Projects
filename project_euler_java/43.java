import java.util.HashSet;

class q_43 {
	static boolean isDivByGroup(long l) {
		String myString = Long.toString(l);
		if (!isPandigital(myString)) {
			return false;
		}
		int[] div_vals = {2,3,5,7,11,13,17};
		for (int i=0; i<myString.length()-3; i++) {
			String curr_string = myString.substring(i+1,i+4);
			int curr_int = Integer.parseInt(curr_string);
			if (curr_int % div_vals[i] != 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isPandigital(String myString) {
		char[] allDigits = "0123456789".toCharArray();
		for (char c : allDigits) {
			if ( myString.indexOf(c) == -1 ) {
				return false;
			}
		}
		return true;
	}

	static boolean areDigitsUnique(String myString) {
		
	static HashSet<String> genExtensibles() {
		int[] myDivs = {17,13,11,7,5,3,2};
		HashSet<String> myCandidates = new HashSet<String>();
		String root = "";
		for (
	public static void main(String[] args) {
		for (long l=1000000010L; l<=9999999999L; l++) {
			if (l % 100000000L == 0) {System.out.println(l);}
			if (isDivByGroup(l)) {
				System.out.println(l);
			}
		}
	}
}

