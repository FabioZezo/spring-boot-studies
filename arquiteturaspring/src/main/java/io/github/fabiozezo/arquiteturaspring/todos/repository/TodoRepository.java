package io.github.fabiozezo.arquiteturaspring.todos.repository;

import io.github.fabiozezo.arquiteturaspring.todos.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    boolean existsByDescricao(String descricao);
}
