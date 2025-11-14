package com.neanderdanubio.auth.domain.entities;

public record RegisterDTO(String login, String password, UserRole role) {
}
