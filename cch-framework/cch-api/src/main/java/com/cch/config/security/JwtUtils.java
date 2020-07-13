package com.cch.config.security;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

public class JwtUtils {

    private static String issuer = "cch";

    private static String SECRET_KEY = "cch";

    private static Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);

    public String createJWT(String subject, long exp) {
        String token = JWT.create()
                .withIssuer(issuer)
                .withSubject(subject)
                .withExpiresAt(new Date(exp))
                .sign(algorithm);
        return token;
    }

    public void verifyJWT(String token) {
        JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
        DecodedJWT jwt = verifier.verify(token);
    }
}
