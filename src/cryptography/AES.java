package cryptography;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;

public class AES implements ICryption {

    @Override
    public String encrypt(String string) {
        try {
            Cipher cipher = Cipher.getInstance("cryptography.AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, KeyStore.AES.getSecretKeySpec());
            return Base64.getEncoder().encodeToString(cipher.doFinal(string.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public String decrypt(String string) {
        try {
            Cipher cipher = Cipher.getInstance("cryptography.AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, KeyStore.AES.getSecretKeySpec());
            return new String(cipher.doFinal(Base64.getDecoder().decode(string)));
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return null;
    }

    public static void main(String... args) {
        final String secretKey = "x7z99kvb6lU";

        String originalString = "***8103***P***59771273***";
        //String encryptedString = encrypt(originalString, secretKey) ;
        //String decryptedString = decrypt(encryptedString, secretKey) ;

        System.out.println(originalString);
        //System.out.println(encryptedString);
        //System.out.println(decryptedString);
    }
}
