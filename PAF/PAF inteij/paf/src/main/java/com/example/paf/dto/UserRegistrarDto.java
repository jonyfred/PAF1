package com.example.paf.dto;

import org.jetbrains.annotations.NotNull;
import jakarta.validation.constraints.NotBlank;

public record UserRegistrarDto(
        @NotBlank String nome,
        @NotNull Float valor,
        @NotBlank String email // Adicione o campo para email
) {}