package infrastructure.security.cryptography;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AES implements ICrypto {

    public static String encrypt(String string) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, KeyStore.AES.getSecretKeySpec());
            return Base64.getEncoder().encodeToString(cipher.doFinal(string.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return null;
    }

    public static String decrypt(String string) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, KeyStore.AES.getSecretKeySpec());
            return new String(cipher.doFinal(Base64.getDecoder().decode(string)));
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return null;
    }
}
