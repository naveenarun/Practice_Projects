import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

class q_8 {
	static long largestProd(String x,int size) {
		long largestProd = 0L;
		for (int i=0; i<x.length()-size+1; i++) {
			String mySample = x.substring(i,i+size);
			long myProd = 1L;
			for (int j=0; j<mySample.length(); j++) {
				myProd *= Integer.parseInt(mySample.substring(j,j+1));
			}
			if (myProd > largestProd) {
				largestProd = myProd;
			}
		}
		return largestProd;
	}

	public static void main(String[] args) {
		try {
			String content;
			content = new String(Files.readAllBytes(Paths.get("8_data.txt")));
			content = content.replace("\n","");
			System.out.println(largestProd(content,13));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

