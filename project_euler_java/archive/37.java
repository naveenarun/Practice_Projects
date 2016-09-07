import Shortcuts.*;

class q_37 {
	static boolean isReversible(int x) {
		String myNum = Integer.toString(x);
		return isTruncatableLeft(myNum) && isTruncatableRight(myNum);
	}

	static boolean isTruncatableLeft(String myString) {
		if (myString.length() <= 1) { return false; }
		for (int i=0; i<myString.length(); i++) {
			int currNum = Integer.parseInt(myString.substring(i,myString.length()));
			if (!Shortcuts.isPrime(currNum)) {
				return false;
			}
		}
		return true;
	}

	static boolean isTruncatableRight(String myString) {
		if (myString.length() <= 1) { return false; }
		for (int i=myString.length()-1; i>=0; i--) {
			int currNum = Integer.parseInt(myString.substring(0,i+1));
			if (!Shortcuts.isPrime(currNum)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int numFound = 0;
		int curr_test = 1;
		long mySum = 0L;
		while (numFound < 11) {
			if (isReversible(curr_test)) {
				numFound++;
				mySum += curr_test;
			}
			curr_test++;
		}
		System.out.println(mySum);
	}
}

