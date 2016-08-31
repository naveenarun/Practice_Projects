import java.util.ArrayList;
import java.util.HashSet;

class q_23 {
	static boolean isAbundant(int x) {
		int mySum = 0;
		for(int i=1; i<=x/2; i++) {
			if (x % i == 0) {
				mySum += i;
			}
		}
		return mySum > x;
	}

	public static void main(String[] args) {
		long mySum = 0L;
		long MAX_VAL = 28122L;
		long myTotal = MAX_VAL * (MAX_VAL + 1) / 2;
		ArrayList<Integer> x = new ArrayList<Integer>();
		HashSet<Integer> c = new HashSet<Integer>();
		HashSet<Integer> a = new HashSet<Integer>();
		for (int i=1; i<MAX_VAL; i++) {
			if (isAbundant(i)) {
				x.add(i);
			}
			a.add(i);
		}
		for (int i=0; i<x.size(); i++) {
			for (int j=i; j<x.size(); j++) {
				c.add(x.get(i)+x.get(j));
			}
		}
		a.removeAll(c);
		for (Integer q : a) {
			mySum += q;
		}
		System.out.println(mySum);
	}
}

