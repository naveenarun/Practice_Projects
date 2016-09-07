import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class q_24 {
	static int factorial(int x) {
		if (x == 1) { return 1; }
		else { return x * factorial(x-1); }
	}

	public static void main(String[] args) {
		int my_num = 1000000;
		ArrayList<Integer> x = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		String answer = "";
		for (int i=9; i>0; i--) {
			int myFactor = my_num / factorial(i);
			int remainder = my_num - myFactor*factorial(i);
			if (remainder == 0) { remainder = myFactor; myFactor -= 1; }
			answer += x.get(myFactor).toString();
			x.remove(myFactor);
			my_num = remainder;
		}
		System.out.println(answer+x.get(0).toString());
	}
}

