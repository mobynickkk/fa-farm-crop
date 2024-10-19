package ru.fa.tech.dto;

import java.util.List;

public record UserDto(String username, List<String> roles) {
    public static UserDto of(String username, List<String> roles) {
        return new UserDto(username, roles);
    }
}
