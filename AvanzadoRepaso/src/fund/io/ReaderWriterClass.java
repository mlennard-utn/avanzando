package fund.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterClass {

	public static void main(String[] args) {
		char[] c = new char[128]; 
		int cLen = c.length;
        // Example use of InputStream methods
        try (FileReader fr = new FileReader("C:\\tmp\\probandolamagia.txt");
             FileWriter fw = new FileWriter("C:\\tmp\\probandolamagia2.txt")) {
            int count = 0;
            int read = 0;
            while ((read = fr.read(c)) != -1) {
                if (read < cLen) fw.write(c, 0, read);
                else fw.write(c);
                count += read;
            }
            System.out.println("Wrote: " + count + " characters.");
        } catch (FileNotFoundException f) {
            System.out.println("File " + args[0] + " not found.");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }


	}

}
