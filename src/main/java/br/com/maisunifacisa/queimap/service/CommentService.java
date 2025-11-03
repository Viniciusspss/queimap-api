package br.com.maisunifacisa.queimap.service;

import br.com.maisunifacisa.queimap.controller.request.CommentRequest;
import br.com.maisunifacisa.queimap.controller.response.UserResponse;
import br.com.maisunifacisa.queimap.domain.Comment;
import br.com.maisunifacisa.queimap.repository.CommentRepository;
import br.com.maisunifacisa.queimap.service.user.SearchUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static br.com.maisunifacisa.queimap.mapper.CommentMapper.toEntity;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final SearchUserService searchUserService;

    public void create(CommentRequest request) {
        UserResponse user = searchUserService.searchAuthenticatedUser();

        Comment comment = toEntity(request);

        commentRepository.save(comment);
    }

    public void deleteById(Long id) {
        Optional<Comment> comment = commentRepository.findById(id);

        if(comment.isEmpty()){
            throw new ResponseStatusException(BAD_REQUEST, "Mensagem não existe");
        }

        commentRepository.deleteById(id);
    }
}
