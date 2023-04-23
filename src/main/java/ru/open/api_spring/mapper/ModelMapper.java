package ru.open.api_spring.mapper;

import org.mapstruct.Mapper;
import ru.open.api_spring.dto.ModelDto;
import ru.open.api_spring.entity.Model;
@Mapper
public interface ModelMapper {
    Model toModel(ModelDto modelDto);
    ModelDto toModelDto(Model model);
}