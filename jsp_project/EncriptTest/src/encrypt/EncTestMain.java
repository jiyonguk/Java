package encrypt;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

public class EncTestMain {

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {

		String str = "Hello~Java";
		
		// 단방향 암호화 객체 생성 : SHA-256
		Sha256 sha256 = new Sha256();
		
		String encStr = sha256.encrypt(str);

		System.out.println(str);
		System.out.println(encStr);
		System.out.println(sha256.encrypt("1"));
		
		// 양방향 암호화 객체 : AES
		String key = "0000000000000001";
		String key2 = "0000000000000002";
		AES256Util aes256Util = new AES256Util(key);
		AES256Util aes256Util2 = new AES256Util(key2);
		
		String encStr1 = aes256Util.encrypt(str);
		String encStr2 = aes256Util2.encrypt(str);
		// 암호화
		System.out.println(str);
		System.out.println(encStr1);
		System.out.println(encStr2);
		
		String plainStr1 = aes256Util.decrypt(encStr1);
		System.out.println(plainStr1);
		
		String plainStr2 = aes256Util2.decrypt(encStr2);
		System.out.println(plainStr2);
	}

}
