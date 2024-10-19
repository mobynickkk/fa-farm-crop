package ru.fa.tech.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.impl.TextCodec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.fa.tech.dto.UserDto;

import java.util.List;

@Service
public class JwtDecodeService {
    @Value("${app.jwt.secret}")
    private String jwtSecret;

    public UserDto getUserInfo(String token) {
        var claims = getClaims(token);
        return UserDto.of(claims.getSubject(), (List<String>) claims.get("roles", List.class));
    }

    private Claims getClaims(String token) {
        return Jwts.parser()
                .setSigningKey(TextCodec.BASE64.decode(jwtSecret)) // используем симметричное шифрование
                .parseClaimsJws(token)
                .getBody();
    }
}
