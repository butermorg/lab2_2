package lab2;

    import java.io.*;

public class FileWork {
    String forReplacer = "default";
    File old = new File("1234.txt");
    File notOld = new File("1234_REPLACE.txt");
    
    public String Read() throws IOException{
        try{
            //попытка чтения
            DataInputStream dais = new DataInputStream (new FileInputStream (old));

            byte[] SomeBytes = new byte[dais.available()];
            dais.readFully(SomeBytes);
            dais.close();

            String entry = new String(SomeBytes, 0, SomeBytes.length);
            forReplacer = entry; 
            System.out.printf("Было:\n%s",entry);
            return entry;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;

      
        
    }
    public String Replace() throws IOException{
        FileWriter fileWriter = new FileWriter(notOld);
        //замена "public" на "private" и запись в файл
        forReplacer = forReplacer.replace("public", "private");
        fileWriter.write(forReplacer);
        fileWriter.close();
        System.out.printf("\nстало: \n%s ",forReplacer);
        return forReplacer;
        
    }
}

