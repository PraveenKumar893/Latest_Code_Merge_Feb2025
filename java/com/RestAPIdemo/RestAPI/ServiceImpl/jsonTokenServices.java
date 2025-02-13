package com.RestAPIdemo.RestAPI.ServiceImpl;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.hibernate.id.insert.GetGeneratedKeysDelegate;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.websocket.Decoder;

@Service
public class jsonTokenServices {
	
	private String secretkey; 
	
	
	public jsonTokenServices() throws NoSuchAlgorithmException {
		
		SecretKey stringKey = KeyGenerator.getInstance("HmacSHA256").generateKey();
		
		secretkey = Base64.getEncoder().encodeToString(stringKey.getEncoded());
		
	}
	
	
	
	
	public String generateTokens(String userName) {
		
		Map<String, Object> keyMap = new HashMap<>();
		
		return Jwts.builder().claims().add(keyMap)
				.subject(userName).issuedAt(new Date(System.currentTimeMillis()))
				.expiration(new Date(System.currentTimeMillis() + 60*60*30)).and()
				.signWith(getKeyValues()).compact() ;			
	}

	private Key getKeyValues() {
		return Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretkey));
	}

}
