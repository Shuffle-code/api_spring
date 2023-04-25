package ru.open.api_spring.service;

import org.modelmapper.ModelMapper;
import ru.open.api_spring.dto.*;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.entity.Model;
import ru.open.api_spring.entity.Technic;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class CommonService {
    public final ModelMapper modelMapper;
    protected CommonService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public List<CommonDto> mappingList(List<Model> modelList) throws NoSuchFieldException, IllegalAccessException {
        List<CommonDto> dtoList = new ArrayList<>();
        Model model = modelList.get(0);
        Field f = model.getClass().getDeclaredField("technic");
        f.setAccessible(true);
        Technic t = (Technic) f.get(model);
        for (Model m : modelList) {
            switch (t.getTypeTechnic().toString()){
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
}
