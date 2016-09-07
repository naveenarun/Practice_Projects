import java.util.HashSet;

class q_74 {
	static int factorial(int x) {
		if (x == 0) { return 1; }
		return x * factorial(x-1);
	}
	
	static long factorialSum(long x) {
		String myNumber = Long.toString(x);
		long mySum = 0L;
		for(int i=0; i<myNumber.length(); i++) {
			mySum += factorial(Integer.parseInt(myNumber.substring(i,i+1)));
		}
		return mySum;
	}

	static int loopLength(long x) {
		int myNum = 1;
		long curr_x = factorialSum(x);
		HashSet<Long> mySet = new HashSet<Long>();
		while (!mySet.contains(curr_x)) {
			mySet.add(curr_x);
			curr_x = factorialSum(curr_x);
			myNum++;
		}
		return myNum;
	}

	public static void main(String[] args) {
		int numChains = 0;
		for(long i=1; i<1000000; i++) {
			int myLength = loopLength(i);
			if (myLength == 60) {
				numChains++;
			}
		}
		System.out.println(numChains);
	}
}

