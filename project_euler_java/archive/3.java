class q_3 {
	public static void main(String[] args) {
		long testVal = 600851475143L;
		long primalityVal = 2L;
		while (testVal != 1) {
			if (testVal % primalityVal == 0) {
				testVal = testVal / primalityVal;
				System.out.println(primalityVal);
			}
			else {
				primalityVal ++;
			}
		}
	}
}

