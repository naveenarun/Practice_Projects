import java.util.ArrayList;
import Shortcuts.*;

class q_11 {
	static int[][] stringToIntList(String x) {
		String[] rows = x.split("\n");
		String[] firstrow = rows[0].split(" ");
		int[][] list = new int[rows.length][firstrow.length];
		for (int i=0; i<rows.length; i++) {
			String[] mycols = rows[i].split(" ");
			for (int j=0; j<mycols.length; j++) {
				list[i][j] = Integer.parseInt(mycols[j]);
			}
		}
		return list;
	}

	static long scanRows(int[][] x) {
		long maxval = 0L;
		for (int i=0; i<20; i++) {
			long product;
			for (int j=0; j<16; j++) {
				product = x[i][j] * x[i][j+1] * x[i][j+2] *x[i][j+3];
				if (product > maxval) { maxval = product; }
			}
		}
		return maxval;
	}

	static long scanCols(int[][] x) {
		long maxval = 0L;
		for (int i=0; i<16; i++) {
			long product;
			for (int j=0; j<20; j++) {
				product = x[i][j] * x[i+1][j] * x[i+2][j] *x[i+3][j];
				if (product > maxval) { maxval = product; }
			}
		}
		return maxval;
	}

	static long scanDiagRight(int[][] x) {
		long maxval = 0L;
		for (int i=0; i<16; i++) {
			long product;
			for (int j=0; j<16; j++) {
				product = x[i][j] * x[i+1][j+1] * x[i+2][j+2] *x[i+3][j+3];
				if (product > maxval) { maxval = product; }
			}
		}
		return maxval;
	}

	static long scanDiagLeft(int[][] x) {
		long maxval = 0L;
		for (int i=0; i<16; i++) {
			long product;
			for (int j=3; j<20; j++) {
				product = x[i][j] * x[i+1][j-1] * x[i+2][j-2] *x[i+3][j-3];
				if (product > maxval) { maxval = product; }
			}
		}
		return maxval;
	}

	public static void main(String[] args) {
		String mydata = Shortcuts.readFile("11_data.txt");
		int[][] mylist = stringToIntList(mydata);
		System.out.println(Math.max(Math.max(scanRows(mylist),scanCols(mylist)),Math.max(scanDiagRight(mylist),scanDiagLeft(mylist))));
	}
}

