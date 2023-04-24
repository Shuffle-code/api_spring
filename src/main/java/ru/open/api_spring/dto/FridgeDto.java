package ru.open.api_spring.dto;

import ru.open.api_spring.dto.common.ModeBaseDto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;
public class FridgeDto extends ModeBaseDto {

    @NotBlank
    private String countDoors;

    @NotBlank
    private String typeCompressor;

    public String getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(String countDoors) {
        this.countDoors = countDoors;
    }

    public String getTypeCompressor() {
        return typeCompressor;
    }

    public void setTypeCompressor(String typeCompressor) {
        this.typeCompressor = typeCompressor;
    }
}