package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.TechnicDao;
import ru.open.api_spring.dto.common.TechnicDto;
import ru.open.api_spring.entity.Technic;

import java.util.List;

@Service
public class TechnicService {
    private final TechnicDao technicDao ;
    private final ModelMapper modelMapper;

    public TechnicService(TechnicDao technicDao, ModelMapper modelMapper) {
        this.technicDao = technicDao;
        this.modelMapper = modelMapper;
    }


    public List<Technic> findAll(){
        return technicDao.findAll();
    }

    public void save(TechnicDto technicDto){
        technicDao.save(modelMapper.map(technicDto, Technic.class));
    }

    public Technic findById(Long id) {
        return technicDao.findById(id).orElse(null);
    }

}
