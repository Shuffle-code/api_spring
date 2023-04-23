package ru.open.api_spring.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.open.api_spring.entity.Technic;

public interface TechnicDao extends JpaRepository<Technic, Long> {
}
