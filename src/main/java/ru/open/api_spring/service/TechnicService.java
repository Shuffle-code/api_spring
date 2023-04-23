package ru.open.api_spring.service;

import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.TechnicDao;
import ru.open.api_spring.entity.Technic;

import java.util.List;

@Service
public class TechnicService {
    private final TechnicDao technicDao ;

    public TechnicService(TechnicDao technicDao) {
        this.technicDao = technicDao;
    }


    public List<Technic> findAll(){
        return technicDao.findAll();
    }

    public void save(Technic technic){
        technicDao.save(technic);
    }

    public Technic findById(Long id) {
        return technicDao.findById(id).orElse(null);
    }

}
