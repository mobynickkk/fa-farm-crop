package ru.fa.tech.auth;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import ru.fa.tech.dto.UserDto;

import java.util.Collection;

public class ExternalSymmetricJwtAuthenticationToken extends AbstractAuthenticationToken {
    private String username;

    public ExternalSymmetricJwtAuthenticationToken(UserDto userDto) {
        // Используем GrantedAuthority как функциональный интерфейс
        super(userDto.roles().stream().map(role -> (GrantedAuthority) () -> role).toList());
        this.username = userDto.username();
    }

    public ExternalSymmetricJwtAuthenticationToken(Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return username;
    }
}
