package ru.open.api_spring.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.open.api_spring.entity.Model;

public interface ModelDao extends JpaRepository<Model, Long> {
}
