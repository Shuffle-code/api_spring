package ru.open.api_spring.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.open.api_spring.entity.Model;

import java.util.List;

public interface ModelDao extends JpaRepository<Model, Long> {
    @Query(value = "SELECT * from model WHERE technic_id = :id", nativeQuery = true)
    List<Model> findByTechnicId (@Param("id") int id);

    @Query(value = "SELECT * from model WHERE name = :name", nativeQuery = true)
    List<String> findByName (@Param("name") String name);
}
