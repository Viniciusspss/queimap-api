package br.com.maisunifacisa.queimap.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    @Email
    private String email;

    @NotBlank(message = "Senha é obrigatório")
    private String password;
}
