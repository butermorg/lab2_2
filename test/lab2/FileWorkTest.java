/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author badca
 */
public class FileWorkTest {

    
   @Test
    public void testRead() throws Exception {
        System.out.println("Read");
        FileWork instance = new FileWork();
        FileWork instance1 = new FileWork();
        String a=instance.Read();
        String b=instance1.Replace();
        assertNotEquals(b, a);
    }
    
    @Test
    public void testReplace() throws Exception {
        System.out.println("Replace");
        FileWork instance = new FileWork();
        String a = instance.Replace();
        int indexJava = a.indexOf("pablic");
        assertEquals(indexJava, -1);
        
    }
  
}
