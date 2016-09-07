import Shortcuts.*;

class q_67 {
	public static void main(String[] args) {
		String myString = Shortcuts.readFile("67_data.txt");
		String[] myRows = myString.split("\n");
		int[][] myTriangle = new int[myRows.length][myRows.length];
		for (int i=0; i<myRows.length; i++) {
			String[] myCols = myRows[i].split(" ");
			for (int j=0; j<myCols.length; j++) {
				myTriangle[i][j] = Integer.parseInt(myCols[j]);
			}
		}
		for (int i=myRows.length-2;i>=0;i--) {
			for (int j=0; j<=i; j++) {
				myTriangle[i][j] += Math.max(myTriangle[i+1][j],myTriangle[i+1][j+1]);
			}
		}
		System.out.println(myTriangle[0][0]);
	}
}

