package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dao.TechnicDao;
import ru.open.api_spring.dto.*;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.dto.common.ModelDto;
import ru.open.api_spring.entity.Model;
import ru.open.api_spring.entity.common.enums.TypeTechnics;

import java.util.ArrayList;
import java.util.List;

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
        return getModelByType(modelDao.findByTechnicId(id), typeTechnic.toString());
    }

    public List<CommonDto> findAllModelByTypeTechnics(String name){
        return getModelByType(modelDao.findAllByTypeTechnic(name), name);
    }

    public List<Model> findByNameNew(String name){
        return modelDao.findByNameNew(name);
    }

    public List<Model> findByColor(String color){
        return modelDao.findByColor(color);
    }

    public List<Model> findByCostNew(Double a, Double b){
        return modelDao.findByCostNew(a, b);
    }

    public List<Model> findAllSortName(){
        return modelDao.findAllSortName();
    }

    public List<Model> findAllSortCost(){
        return modelDao.findAllSortCost();
    }

    public List<CommonDto> getModelByType(List<Model> modelList, String name){
        List<CommonDto> dtoList = new ArrayList<>();
        for (Model m : modelList) {
            switch (name){
                case ("TV"):
                    dtoList.add(modelMapper.map(m, TvDto.class));
                    break;
                case ("PC"):
                    dtoList.add(modelMapper.map(m, PcDto.class));
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

//    public CommonDto getModelByType(Model model){
//        model.
//
//        for (Model m : modelList) {
//            switch (name){
//                case ("TV"):
//                    dtoList.add(modelMapper.map(m, TvDto.class));
//                    break;
//                case ("PC"):
//                    dtoList.add(modelMapper.map(m, PcDto.class));
//                    break;
//                case ("VACUUM_CLEANER"):
//                    dtoList.add(modelMapper.map(m, VacuumCleanerDto.class));
//                    break;
//                case ("FRIDGE"):
//                    dtoList.add(modelMapper.map(m, FridgeDto.class));
//                    break;
//                case ("SMARTPHONE"):
//                    dtoList.add(modelMapper.map(m, SmartphoneDto.class));
//                    break;
//            }
//        }
//        return dtoList;
//    }


}
