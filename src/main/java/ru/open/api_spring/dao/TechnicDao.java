package ru.open.api_spring.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.open.api_spring.entity.Model;
import ru.open.api_spring.entity.Technic;

import java.util.List;

public interface TechnicDao extends JpaRepository<Technic, Long> {

}
