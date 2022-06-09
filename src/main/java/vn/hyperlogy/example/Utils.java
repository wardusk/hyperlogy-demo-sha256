package vn.hyperlogy.example;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

public class Utils {

    public static String generateHmac256(String data, byte[] key) throws InvalidKeyException, NoSuchAlgorithmException {
        String algorithm = "HmacSHA256";
        Mac mac = Mac.getInstance(algorithm);
        mac.init(new SecretKeySpec(key, algorithm));
        byte[] bytes = mac.doFinal(data.getBytes());
        return Hex.encodeHexString(bytes);
    }
}
