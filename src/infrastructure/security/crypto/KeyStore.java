package infrastructure.security.crypto;

import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;

public enum KeyStore {
    AES("x7z99kvb6lU", "AES"),
    DES("su28HS82j2d", "DES")
    ;

    private String secret;
    private SecretKeySpec secretKeySpec;
    private String algorithm;

    KeyStore(String secret, String algorithm) {
        this.secret = secret;
        byte[] key;
        MessageDigest messageDigest;
        try {
            key = secret.getBytes(StandardCharsets.UTF_8);
            messageDigest = MessageDigest.getInstance("SHA-1");
            key = messageDigest.digest(key);
            key = Arrays.copyOf(key, 16);
            this.secretKeySpec = new SecretKeySpec(key, algorithm);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public String getSecret() {
        return secret;
    }

    public SecretKeySpec getSecretKeySpec() {
        return secretKeySpec;
    }

    public String getAlgorithm() {
        return algorithm;
    }
}