package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dto.TvDto;
import ru.open.api_spring.entity.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class TvService {
    private final ModelDao modelDao;
    private final ModelMapper modelMapper;


    public TvService(ModelDao modelDao, ModelMapper modelMapper) {
        this.modelDao = modelDao;
        this.modelMapper = modelMapper;
    }

    public List<TvDto> findAllTv(){
        List<TvDto> tvDtoList = new ArrayList<>();
        for (Model m : modelDao.findAllTV()) {
            tvDtoList.add(modelMapper.map(m, TvDto.class));
        }
        return tvDtoList;
    }

//    public void save(ModelDto modelDto){
//        modelDao.save(modelMapper.map(modelDto, Model.class));
//    }
//
//    public Model findById(Long id) {
//        return modelDao.findById(id).orElse(null);
//    }
//
//
//    public List<Model> findByTechnicId(int id){
//        return modelDao.findByTechnicId(id);
//    }
}
