package fund.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputFileStream {

	public static void main(String[] args) {
		byte[] b = new byte[128]; 
		int bLen = b.length;
        // Example use of InputStream methods
        try (FileInputStream fis = new FileInputStream ("C:\\tmp\\jre.exe");
             FileOutputStream fos = new FileOutputStream ("C:\\tmp\\otra-jre.exe")) {
           System.out.println ("Bytes available: " + fis.available());
           int count = 0; 
           int read = 0;
           read = fis.read(b);
           while (read != -1) {
               if (read < bLen) { 
            	   fos.write(b, 0, read);
               } else { 
            	   fos.write(b);
               }	   
               count += read;
               read = fis.read(b);
            }
            System.out.println ("Wrote: " + count);
        } catch (FileNotFoundException f) {
            System.out.println ("File not found: " + f);
        } catch (IOException e) {
            System.out.println ("IOException: " + e);
        } catch (Exception e) {
        	System.out.println ("Exception: " + e);
        }


	}

}
