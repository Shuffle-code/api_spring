package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.open.api_spring.dao.ModelDao;
import ru.open.api_spring.dto.PcDto;
import ru.open.api_spring.dto.TvDto;
import ru.open.api_spring.entity.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class PcService {

    private final ModelDao modelDao;
    private final ModelMapper modelMapper;

    public PcService(ModelDao modelDao, ModelMapper modelMapper) {
        this.modelDao = modelDao;
        this.modelMapper = modelMapper;
    }

    public List<PcDto> findAllPc() {
        List<PcDto> pcDtoList = new ArrayList<>();
        for (Model m : modelDao.findAllPc()) {
            pcDtoList.add(modelMapper.map(m, PcDto.class));
        }
        return pcDtoList;
    }

}
