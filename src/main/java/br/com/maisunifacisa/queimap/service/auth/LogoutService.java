package br.com.maisunifacisa.queimap.service.auth;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LogoutService {
    public ResponseEntity<Void> logout() {
        return ResponseEntity.noContent().build();
    }
}
