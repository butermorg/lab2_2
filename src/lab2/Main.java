
package lab2;

import java.io.*;


public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        try{
 FileWork test = new FileWork();
    test.Read();
    test.Replace();
        }
        catch (FileNotFoundException e) {
System.err.println(e);
}
}
}