package br.com.maisunifacisa.queimap.repository;

import br.com.maisunifacisa.queimap.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
