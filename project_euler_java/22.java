import Shortcuts.*;
import java.util.Arrays;
class q_22 {
	public static void main(String[] args) {
		String a = Shortcuts.readFile("22_data.txt");
		String[] b = a.split(",");
		for(int i=0; i<b.length; i++) {
			b[i] = b[i].replace("\"","").replace("\n","");
		}	
		Arrays.sort(b);
		long mySum = 0L;
		for(int i=0; i<b.length; i++) {
			long nameSum = 0L;
			for (int j=0; j<b[i].length(); j++) {
				nameSum += b[i].charAt(j)-'A'+1;
			}
			mySum += (i+1)*nameSum;
		}
		System.out.println(mySum);
	}
}

