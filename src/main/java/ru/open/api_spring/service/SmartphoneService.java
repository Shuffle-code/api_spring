package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dto.SmartphoneDto;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.entity.Model;

import java.util.List;

@Service
public class SmartphoneService extends CommonService {
    private final ModelDao modelDao;


    public SmartphoneService(ModelDao modelDao, ModelMapper modelMapper) {
        super(modelMapper);
        this.modelDao = modelDao;
    }

    public List<CommonDto> findAllSmartphone() {
        try {
            return mappingList(modelDao.findAllSmartphone());
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(SmartphoneDto smartphoneDto){
        modelDao.save(modelMapper.map(smartphoneDto, Model.class));
    }

    public List<CommonDto> findSmartphoneName(String name) {
        try {
            return mappingList(modelDao.findSmartphoneByName(name));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CommonDto> findSmartphoneRemember(String remember) {
        try {
            return mappingList(modelDao.findSmartphoneByCompressor(remember));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CommonDto> findSmartphoneByCountCameras(Integer count) {
        try {
            return mappingList(modelDao.findSmartphoneByCountDoor(count));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
