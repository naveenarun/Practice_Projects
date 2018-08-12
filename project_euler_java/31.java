class q_31 {
	static int waysToMake(int x, int acceptableStart) {
		int[] acceptable = {1,2,5,10,20,50,100,200};
		int addCount = 0;
		if (x == 0) {return 1;}
		for (int i=acceptableStart; i<acceptable.length; i++) {
			int q = acceptable[i];
			if (x >= q) {
				addCount += waysToMake(x-q,i);
			}
		}
		return addCount;
	}

	static int waysToMake(int x) { return waysToMake(x,0); }

	public static void main(String[] args) {
		System.out.println(waysToMake(200));
	}
}

