class q_33 {
	static boolean isCrossCancel(int a, int b) {
		if (a == b) { return false; }
		int a1 = (a / 10);
		int a2 = a % 10;
		int b1 = (b / 10);
		int b2 = b % 10;
		if (a2 == b2 && b2 == 0) { return false; }
		if (a1 == b1) { return a*b2==b*a2; }
		if (a1 == b2) { return a*b1==b*a2; }
		if (a2 == b1) { return a*b2==b*a1; }
		if (a2 == b2) { return a*b1==b*a1; }
		return false;
	}

	public static void main(String[] args) {
		long numProd = 1L;
		long denomProd = 1L;
		for (int i=10; i<=99; i++) {
			for (int j=i+1;j<=99;j++) {
				if (isCrossCancel(i,j)) {
					denomProd *= j;
					numProd *= i;
				}
			}
		}
		System.out.printf("%s/%s\n",numProd,denomProd);
	}
}

