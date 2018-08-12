class q_9 {
	static int findTripletProduct(int sumval) {
		for (int i=1; i<=(sumval-2)/3; i++) {
			for (int j=i+1; j<=(sumval-i)/2; j++) {
				if (i*i + j*j == (sumval-i-j)*(sumval-i-j)) {
					return i*j*(sumval-i-j);
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(findTripletProduct(1000));
	}
}

