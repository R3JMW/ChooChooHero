package com.cch.config.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

public class JwtUtils {

    private static String ISSUER = "cch";

    private static String SECRET_KEY = "cch-mobile";

    private static long EXPIRITION = 1000 * 24 * 60 * 60 * 30L;  // expired 30d

    private static Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);

    /**
     * Cenerate JWT Token
     * XXXX.YYYY.ZZZZ
     *
     * @param subject
     * @return String
     */
    public static String generateJWT(String subject) {
        return JWT
                .create()
                .withSubject(subject)
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRITION))
                .withIssuer(ISSUER)
                .withIssuedAt(new Date())
                .sign(algorithm);
    }

    /**
     * Verify JWT Token
     *
     * @param token
     */
    public static DecodedJWT verifyJWT(String token) {
        JWTVerifier verifier = JWT
                .require(algorithm)
                .withIssuer(ISSUER)
                .build();
        DecodedJWT verifyJWT = verifier.verify(token);
        return verifyJWT;
    }

    public static void main(String[] args) {
        JwtUtils.generateJWT("asdf");
    }
}
