package ru.open.api_spring.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.open.api_spring.entity.Model;
import java.util.List;

public interface ModelDao extends JpaRepository<Model, Long> {
    @Query(value = "SELECT * from model WHERE technic_id = :id", nativeQuery = true)
    List<Model> findByTechnicId (@Param("id") Long id);
    @Query(value = "SELECT * from model WHERE name = :name", nativeQuery = true)
    List<String> findByName (@Param("name") String name);
    @Query(value = "SELECT * FROM model WHERE technic_id IN " +
            "( SELECT id from technic  where technic.type_technic = :name)", nativeQuery = true)
    List<Model> findAllByTypeTechnic(@Param("name") String name);
    @Query(value = "SELECT * FROM model WHERE technic_id IN " +
            "( SELECT id from technic  where technic.type_technic = 'TV')", nativeQuery = true)
    List<Model> findAllTV();
    @Query(value = "SELECT * from model WHERE LOWER(name) = LOWER(:name)", nativeQuery = true)
    List<Model> findByNameNew (@Param("name") String lastname);
    List<Model> findByColor (@Param("color") String color);
    @Query(value = "SELECT * from model WHERE cost BETWEEN :a AND :b ORDER BY cost ASC", nativeQuery = true)
    List<Model> findByCostNew (@Param("a") Double a, @Param("b") Double b);
    @Query(value = "SELECT * from model ORDER BY name ASC", nativeQuery = true)
    List<Model> findAllSortName();
    @Query(value = "SELECT * from model ORDER BY cost ASC", nativeQuery = true)
    List<Model> findAllSortCost();

    @Query(value = "SELECT * FROM model WHERE technic_id IN " +
            "( SELECT id from technic  where technic.type_technic = 'PC')", nativeQuery = true)
    List<Model> findAllPc();

}
