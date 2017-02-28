import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zwaclaw
 * @version 1.0
 */

public class testas{
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
     GetHash("Egle Predkelyte");
    }
   
    public static void GetHash(String name) throws UnsupportedEncodingException, NoSuchAlgorithmException{
     
        byte[] theTextToDigestAsBytes=name.getBytes("8859_1");
           MessageDigest md= MessageDigest.getInstance("MD5");
           md.update(theTextToDigestAsBytes);
           byte[] digest= md.digest();
           for(byte b: digest){
               System.out.printf("%02X", b & 0xff);
           }
     
     
    }
} 
