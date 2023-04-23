package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dto.ModelDto;
import ru.open.api_spring.entity.Model;

import java.util.List;

@Service
public class ModelService {
    private final ModelDao modelDao;
    private final ModelMapper modelMapper;


    public ModelService(ModelDao modelDao, ModelMapper modelMapper) {
        this.modelDao = modelDao;
        this.modelMapper = modelMapper;
    }

    public List<Model> findAll(){
        return modelDao.findAll();
    }

    public void save(ModelDto modelDto){
        modelDao.save(modelMapper.map(modelDto, Model.class));
    }

    public Model findById(Long id) {
        return modelDao.findById(id).orElse(null);
    }


    public List<Model> findByTechnicId(int id){
        return modelDao.findByTechnicId(id);
    }
}
