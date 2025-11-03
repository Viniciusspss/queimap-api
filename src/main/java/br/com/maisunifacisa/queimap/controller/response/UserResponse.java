package br.com.maisunifacisa.queimap.controller.response;

import br.com.maisunifacisa.queimap.domain.Comment;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<CommentResponse> comments;
}
