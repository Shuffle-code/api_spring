package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dto.FridgeDto;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.entity.Model;

import java.util.List;

@Service
public class FridgeService extends CommonService {
    private final ModelDao modelDao;


    public FridgeService(ModelDao modelDao, ModelMapper modelMapper) {
        super(modelMapper);
        this.modelDao = modelDao;
    }

    public List<CommonDto> findAllFridge() throws NoSuchFieldException, IllegalAccessException {
        return mappingList(modelDao.findAllFridge());
    }

    public void save(FridgeDto fridgeDto){
        modelDao.save(modelMapper.map(fridgeDto, Model.class));
    }

    public List<CommonDto> findFridgeName(String name) {
        try {
            return mappingList(modelDao.findFridgeByName(name));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CommonDto> findFridgeCompressor(String compressor) {
        try {
            return mappingList(modelDao.findFridgeByCompressor(compressor));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CommonDto> findFridgeByCountDoor(Integer count) {
        try {
            return mappingList(modelDao.findFridgeByCountDoor(count));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
