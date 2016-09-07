import java.util.HashSet;
import Shortcuts.*;

class q_41 {
	static HashSet<String> genPermutations(String n) {
		HashSet<String> a = new HashSet<String>();
		if (n.length() == 1) { a.add(n); return a; }
		for (int i=0; i<n.length(); i++) {
			String firstChar = n.substring(i,i+1);
			String firstSegment = n.substring(0,i);
			String lastSegment = n.substring(i+1,n.length());
			HashSet<String> q = genPermutations(firstSegment + lastSegment);
			for (String s : q) {
				a.add(firstChar + s);
			}
		}
		return a;
	}
	
	static HashSet<Long> genPermutations(int n) {
		String myString = "";
		for (int i=1; i<=n; i++) {
			myString += Integer.toString(i);
		}
		HashSet<String> q = genPermutations(myString);
		HashSet<Long> out = new HashSet<Long>();
		for (String s : q) {
			out.add(Long.parseLong(s));
		}
		return out;
	}

	public static void main(String[] args) {
		HashSet<Long> a = genPermutations(5);
		Long best = 0L;
		for (int i=1; i<=9; i++) {
			HashSet<Long> nums = genPermutations(i);
			for (Long l : nums) {
				if (Shortcuts.isPrime(l) && l > best) {
					best = l;
				}
			}
		}
		System.out.println(best);
	}
}

