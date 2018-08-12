class q_6 {
	public static int diffSumSq(int x) {
		int mysum = 0, mysum_sq = 0;
		for (int i=1; i<=x; i++) {
			mysum += i;
			mysum_sq += i*i;
		}
		return mysum*mysum-mysum_sq;
	}
	
	public static void main(String[] args) {
		int MY_VAL = 100;
		System.out.println(diffSumSq(MY_VAL));
	}
}

