class q_28 {
	static long square_sum(int dim) {
		if (dim == 1) {return 1L;}
		return dim*dim*4 - (dim-1)*6 + square_sum(dim-2);
	}
	public static void main(String[] args) {
		System.out.println(square_sum(1001));
	}
}

