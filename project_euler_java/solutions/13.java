import Shortcuts.*;
import java.math.BigInteger;

class q_13 {
	public static void main(String[] args) {
		String a = Shortcuts.readFile("13_data.txt");
		String[] a_split = a.split("\n");
		BigInteger sum = new BigInteger("0");
		for(int i=0; i<a_split.length; i++) {
			sum = sum.add(new BigInteger(a_split[i]));
		}
		System.out.println(sum.toString().substring(0,10));
	}
}

