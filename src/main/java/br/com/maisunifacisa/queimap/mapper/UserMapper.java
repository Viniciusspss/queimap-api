package br.com.maisunifacisa.queimap.mapper;

import br.com.maisunifacisa.queimap.controller.request.RegisterUserRequest;
import br.com.maisunifacisa.queimap.controller.response.UserResponse;
import br.com.maisunifacisa.queimap.domain.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {
    public static User toEntity(final RegisterUserRequest request) {
        return User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }

    public static UserResponse toResponse(final User entity) {
        return UserResponse.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .build();
    }
}
