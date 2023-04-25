package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dto.PcDto;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.entity.Model;

import java.util.List;
@Service
public class PcService extends CommonService{

    private final ModelDao modelDao;

    public PcService(ModelDao modelDao, ModelMapper modelMapper) {
        super(modelMapper);
        this.modelDao = modelDao;
    }

    public void save(PcDto pcDto){
        modelDao.save(modelMapper.map(pcDto, Model.class));
    }

    public List<CommonDto> findAllPc() {
        try {
            return mappingList(modelDao.findAllPc());
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CommonDto> findPcName(String name) {
        try {
            return mappingList(modelDao.findPcByName(name));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CommonDto> findPcCategory(String name) {
        try {
            return mappingList(modelDao.findPCByCategory(name));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CommonDto> findPcProcessor(String processor) {
        try {
            return mappingList(modelDao.findPcByProcessor(processor));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


}
