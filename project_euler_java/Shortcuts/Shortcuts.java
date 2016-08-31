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
}

