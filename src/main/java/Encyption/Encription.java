import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;


public class Encription{
    public static void main(String[] args) {

        try{
            
            File answers = new File("Data//Spook.txt");
            
            Scanner AnsSC = new Scanner(answers);
            
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();

            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");


            byte[] text = "The answer is hidden in this code! WOAH ENCRIPTION THATS INSANE!!!!!!!!".getBytes("UTF8");


            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);

            String encriptedAns = new String(textEncrypted);
            
            FileWriter Writer = new FileWriter("Data//Spook.txt");
            Writer.write(encriptedAns);
            Writer.close();
            
            String ToDecript = AnsSC.next();

            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);

            String Ans = new String(textDecrypted);
            System.out.println(Ans);
        }catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}