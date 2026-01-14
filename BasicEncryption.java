import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class BasicEncryption {

    // 1. Define a 16-character Key (Must be exactly 16, 24, or 32 chars)
    private static final String SECRET_KEY = "MySuperSecretKey"; 

    public static void main(String[] args) {
        try {
            String originalMessage = "Abhinav Sujit Pawar";

            // Encrypt
            String encrypted = encrypt(originalMessage);
            System.out.println("Encrypted: " + encrypted);

            // Decrypt
            String decrypted = decrypt(encrypted);
            System.out.println("Decrypted: " + decrypted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String strToEncrypt) throws Exception {
        // Create Key
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        
        // Setup Cipher
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        
        // Encrypt and return as Base64 (so it's readable text)
        return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes()));
    }

    public static String decrypt(String strToDecrypt) throws Exception {
        // Create Key
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        
        // Setup Cipher
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        
        // Decrypt
        return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
    }
}