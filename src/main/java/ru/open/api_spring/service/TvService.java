package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dto.TvDto;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.entity.Model;
import java.util.List;

@Service
public class TvService extends CommonService{
    private final ModelDao modelDao;


    public TvService(ModelDao modelDao, ModelMapper modelMapper) {
        super(modelMapper);
        this.modelDao = modelDao;
    }

    public List<CommonDto> findAllTv() throws NoSuchFieldException, IllegalAccessException {
        return mappingList(modelDao.findAllTV());
    }

    public void save(TvDto tvDto){
        modelDao.save(modelMapper.map(tvDto, Model.class));
    }

    public List<CommonDto> findTvName(String name) throws NoSuchFieldException, IllegalAccessException {
        return mappingList(modelDao.findTvByName(name));
    }
    public List<CommonDto> findTvCategory(String name) throws NoSuchFieldException, IllegalAccessException {
        return mappingList(modelDao.findTvByCategory(name));
    }
    public List<CommonDto> findTvByTechnology(String technology) throws NoSuchFieldException, IllegalAccessException {
        return mappingList(modelDao.findTvByTechnology(technology));
    }


}
