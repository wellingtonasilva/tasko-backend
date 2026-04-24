package br.com.wassistemas.tasko.common.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.Map;

public class JwtTokenProvider {
    private static final String JWT_SECRET = "dGFza28tc3VwZXItc2VjcmV0LWtleS13aGljaC1zaG91bGQtYmUtbG9uZy1hbmQtc2VjdXJlLTIwMjY="; // base64 de 'tasko-super-secret-key-which-should-be-long-and-secure-2026'
    private static final long JWT_EXPIRATION_MS = 86400000L; // 1 dia
    private static final Key KEY = Keys.hmacShaKeyFor(Decoders.BASE64.decode(JWT_SECRET));

    public String generateToken(String username, Map<String, Object> claims) {
        return Jwts.builder()
                .subject(username)
                .claims(claims)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION_MS))
                .signWith(KEY)
                .compact();
    }

    public Jws<Claims> validateToken(String token) {
        return ((io.jsonwebtoken.JwtParser) Jwts.parser().setSigningKey(KEY)).parseClaimsJws(token);
    }

    public String getUsernameFromToken(String token) {
        return validateToken(token).getPayload().getSubject();
    }

    public Object getClaimFromToken(String token, String claimKey) {
        return validateToken(token).getPayload().get(claimKey);
    }
}
