import Shortcuts.*;

class q_42 {
	static boolean isTriangle(int x) {
		int startVal = 1;
		while (x > 0) {
			x -= startVal;
			startVal++;
		}
		return x == 0;
	}

	static int wordVal(String s) {
		int mySum = 0;
		for(int i=0; i<s.length(); i++) {
			mySum += s.charAt(i) - 'A' + 1;
		}
		return mySum;
	}

	public static void main(String[] args) {
		String[] myvals = Shortcuts.readFile("42_data.txt").replace("\n","").replace("\"","").split(",");
		int numTriangle = 0;
		for(int i=0; i<myvals.length; i++) {
			if (isTriangle(wordVal(myvals[i]))) {
				numTriangle++;
			}
		}
		System.out.println(numTriangle);
	}
}

