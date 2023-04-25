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
    List<Model> findByNameNew (@Param("name") String name);
    List<Model> findByColor (@Param("color") String color);
    @Query(value = "SELECT * from model WHERE cost BETWEEN :a AND :b ORDER BY cost ASC", nativeQuery = true)
    List<Model> findByCostNew (@Param("a") Double a, @Param("b") Double b);
    @Query(value = "SELECT * from model ORDER BY name ASC", nativeQuery = true)
    List<Model> findAllSortName();
    @Query(value = "SELECT * from model ORDER BY cost ASC", nativeQuery = true)
    List<Model> findAllSortCost();
    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'PC')",
            nativeQuery = true)
    List<Model> findAllPc();

    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'PC' and LOWER(name) = LOWER(:name))",
            nativeQuery = true)
    List<Model> findPcByName(@Param("name") String name);

    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'TV' and LOWER(name) = LOWER(:name))",
            nativeQuery = true)
    List<Model> findTvByName(@Param("name") String name);

    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'TV' and LOWER(category) = LOWER(:category))",
            nativeQuery = true)
    List<Model> findTvByCategory(@Param("category") String category);

    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'TV' and LOWER(technology) = LOWER(:technology))",
            nativeQuery = true)
    List<Model> findTvByTechnology(@Param("technology") String technology);

    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'PC' and LOWER(category) = LOWER(:category))",
            nativeQuery = true)
    List<Model> findPCByCategory(@Param("category") String category);
    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'PC' and LOWER(type_processor) = LOWER(:processor))",
            nativeQuery = true)
    List<Model> findPcByProcessor(@Param("processor") String processor);

    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'FRIDGE')",
            nativeQuery = true)
    List<Model> findAllFridge();
    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'FRIDGE' and LOWER(name) = LOWER(:name))",
            nativeQuery = true)
    List<Model> findFridgeByName(@Param ("name") String name);
    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'FRIDGE' and LOWER(type_compressor) = LOWER(:compressor))",
            nativeQuery = true)
    List<Model> findFridgeByCompressor(@Param ("compressor") String compressor);
    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'FRIDGE' and count_doors = :count)",
            nativeQuery = true)
    List<Model> findFridgeByCountDoor(@Param ("count") Integer count);

    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'SMARTPHONE')",
            nativeQuery = true)
    List<Model> findAllSmartphone();
    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'SMARTPHONE' and LOWER(name) = LOWER(:name))",
            nativeQuery = true)
    List<Model> findSmartphoneByName(@Param ("name") String name);
    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'SMARTPHONE' and LOWER(remember) = LOWER(:remember))",
            nativeQuery = true)
    List<Model> findSmartphoneByCompressor(@Param ("remember") String remember);
    @Query(value = "SELECT * FROM model WHERE technic_id IN ( SELECT id from technic  where technic.type_technic = 'SMARTPHONE' and count_cameras = :count)",
            nativeQuery = true)
    List<Model> findSmartphoneByCountDoor(@Param ("count") Integer count);
}
