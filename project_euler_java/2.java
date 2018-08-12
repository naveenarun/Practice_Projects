class q_2 {
	public static void main(String[] args) {
		int MAX_VAL = 4000000;
		int term_1 = 1, term_2 = 2;
		int temp;
		int my_sum = 0;
		while (term_2 < MAX_VAL) {
			if (term_2 % 2 == 0) {
				my_sum += term_2;
			}
			temp = term_1 + term_2;
			term_1 = term_2;
			term_2 = temp;
		}
		System.out.println(my_sum);
	}
}

