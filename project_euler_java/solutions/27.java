import Shortcuts.*;

class q_27 {
	static long quad(int x,int a,int b) {
		return x*x + x*a + b;
	}
	static int goodUntil(int a, int b) {
		int start_n = 0;
		while (Shortcuts.isPrime(quad(start_n,a,b))) {
			start_n++;
		}
		return start_n;
	}
	public static void main(String[] args) {
		int best_a=0;
		int best_b=0;
		int best_num = 0;
		for (int a=-999; a<=999; a++) {
			for (int b=-1000; b<=1000; b++) {
				int num = goodUntil(a,b);
				if (num > best_num) {
					best_a = a;
					best_b = b;
					best_num = num;
				}
			}
		}
		System.out.println(best_a*best_b);
	}
}

