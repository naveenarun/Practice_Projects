class q_1 {
	public static void main(String[] args) {
		int mySum = 0;
		for(int i=1; i<1000; i++) {
			mySum += (i%3==0 || i%5==0) ? i : 0;
		}
		System.out.println(mySum);
	}
}

