import Shortcuts.*;

class q_35 {
	static String rotate(String s) {
		return s.substring(1,s.length())+s.substring(0,1);
	}
	
	static boolean isCircular(int x) {
		String x_str = Integer.toString(x);
		for(int i=0; i<x_str.length(); i++) {
			int curr_val = Integer.parseInt(x_str);
			if (!Shortcuts.isPrime(curr_val)) {
				return false;
			}
			x_str = rotate(x_str);
		}
		return true;
	}

	public static void main(String[] args) {
		int myCount = 0;
		for(int i=0; i<1000000; i++) {
			if (isCircular(i)) {
				myCount++;
			}
		}
		System.out.println(myCount);
	}
}

