package com.seguranca.demonstracao.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

import static java.lang.Long.parseLong;

@Component
public class JWTService {

    private static final String chavePrivadaJWT = "agshsF54Scx6iI";

    public String gerarToken(Authentication authentication) {
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

        Date dataAtual = new Date();
        int tempoExpiracao = 86400000; // 1 dia em milisegundos
        Date dataExpiracao = new Date(new Date().getTime() + tempoExpiracao);

        return Jwts.builder()
                .setSubject(Long.toString(userPrincipal.getId()))
                .setIssuedAt(dataAtual)
                .setExpiration(dataExpiracao)
                .signWith(SignatureAlgorithm.HS512, chavePrivadaJWT)
                .compact();

    }

    public Optional<Long> getUserId(String jwt) {
        try {
            Claims claims = parse(jwt).getBody();
            return Optional.ofNullable(parseLong(claims.getSubject()));
        } catch (Exception ex) {
            return Optional.empty();
        }
    }

    private Jws<Claims> parse(String jwt) {
        return Jwts.parser().setSigningKey(chavePrivadaJWT).parseClaimsJws(jwt);
    }


}
