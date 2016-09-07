package Shortcuts;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;

public class Shortcuts {
        public static String readFile(String filename) {
                try {
                        String mydata = new String(Files.readAllBytes(Paths.get(filename)));
                        return mydata;
                }
                catch (IOException e) {
                        e.printStackTrace();
                        return "";
                }
        }
	public static boolean isPrime(int x) {
		if (x <= 1) {return false;}
		for (int i=2; i<=Math.floor(Math.sqrt(x)); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(long x) {
		if (x<=1) {return false;}
		for (long i=2; i<=Math.floor(Math.sqrt(x)); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(11));
	}
}

