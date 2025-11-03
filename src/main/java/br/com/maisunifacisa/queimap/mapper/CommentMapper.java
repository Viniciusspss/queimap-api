package br.com.maisunifacisa.queimap.mapper;

import br.com.maisunifacisa.queimap.controller.response.CommentResponse;
import br.com.maisunifacisa.queimap.domain.Comment;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CommentMapper {

    public static CommentResponse toResponse(final Comment entity) {
        return CommentResponse.builder()
                .id(entity.getId())
                .text(entity.getText())
                .userId(entity.getUser().getId())
                .build();
    }
}
