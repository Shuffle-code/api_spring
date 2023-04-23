package ru.open.api_spring.service;

import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.entity.Model;

import java.util.List;

@Service
public class ModelService {
    private final ModelDao modelDao;


    public ModelService(ModelDao modelDao) {
        this.modelDao = modelDao;
    }

    public List<Model> findAll(){
        return modelDao.findAll();
    }

    public void save(Model model){
        modelDao.save(model);
    }

    public Model findById(Long id) {
        return modelDao.findById(id).orElse(null);
    }

}
