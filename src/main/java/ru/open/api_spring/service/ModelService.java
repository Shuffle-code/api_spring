package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dao.TechnicDao;
import ru.open.api_spring.dto.*;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.dto.common.ModelDto;
import ru.open.api_spring.entity.Model;
import ru.open.api_spring.entity.Technic;
import ru.open.api_spring.entity.common.enums.TypeTechnics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModelService {
    private final ModelDao modelDao;
    private final ModelMapper modelMapper;

    private final TechnicDao technicDao;


    public ModelService(ModelDao modelDao, ModelMapper modelMapper, TechnicDao technicDao) {
        this.modelDao = modelDao;
        this.modelMapper = modelMapper;
        this.technicDao = technicDao;
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


    public List<CommonDto> findByTechnicId(Long id){
        TypeTechnics typeTechnic = technicDao.findById(id).get().getTypeTechnic();
        System.out.println(typeTechnic.toString());
        return findModelByType(modelDao.findByTechnicId(id), typeTechnic.toString());
    }

//    public List<Model> findByTechnicId(Long id){
//        return modelDao.findByTechnicId(id);
//    }

    public List<CommonDto> findAllModelByTypeTechnics(String name){
        return findModelByType(modelDao.findAllByTypeTechnic(name), name);
    }


    public Model findByNameNew(String name){
        return modelDao.findByNameNew(name);
    }


    public List<CommonDto> findModelByType(List<Model> modelList, String name){
        List<CommonDto> dtoList = new ArrayList<>();
        for (Model m : modelList) {
            switch (name){
                case ("TV"):
                    dtoList.add(modelMapper.map(m, TvDto.class));
                    break;
                case ("PC"):
                    dtoList.add(modelMapper.map(m, PCDto.class));
                    break;
                case ("VACUUM_CLEANER"):
                    dtoList.add(modelMapper.map(m, VacuumCleanerDto.class));
                    break;
                case ("FRIDGE"):
                    dtoList.add(modelMapper.map(m, FridgeDto.class));
                    break;
                case ("SMARTPHONE"):
                    dtoList.add(modelMapper.map(m, SmartphoneDto.class));
                    break;
            }
        }
        return dtoList;
    }


}
