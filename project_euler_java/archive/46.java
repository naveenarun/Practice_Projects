import Shortcuts.*;

class q_46 {

	static boolean isGoldbachOrPrime(long x) {
		if (Shortcuts.isPrime(x)) { return true; }
		for (long i=1; i<=Math.sqrt(x/2-1); i++) {
			if (Shortcuts.isPrime(x-2*i*i)) { return true; }
		}
		return false;
	}

	public static void main(String[] args) {
		long i = 3L;
		while (isGoldbachOrPrime(i)) {
			i += 2;
		}
		System.out.println(i);
	}
}

