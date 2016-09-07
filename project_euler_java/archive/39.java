class q_39 {
	static boolean isPythagorean(int a,int b,int c) {
		return a*a+b*b==c*c;
	}
	static int numTriangles(int perimeter) {
		int numSols = 0;
		for(int i=0; i<=perimeter-1; i++) {
			for(int j=i; j<=(perimeter-i-1)/2; j++) {
				int k = perimeter - j - i;
				if (isPythagorean(i,j,k)) { numSols++; }
			}
		}
		return numSols;
	}

	public static void main(String[] args) {
		int max_X = 0;
		int max_Y = 0;
		for(int p=0; p<=1000; p++) {
			int curr_y = numTriangles(p);
			if (curr_y > max_Y) {
				max_Y = curr_y;
				max_X = p;
			}
		}
		System.out.println(max_X);
	}
}

