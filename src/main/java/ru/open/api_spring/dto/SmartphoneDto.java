package ru.open.api_spring.dto;

import ru.open.api_spring.dto.common.ModeBaseDto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class SmartphoneDto extends ModeBaseDto {

    @NotBlank
    private String remember;

    @NotBlank
    private String countCameras;

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    public String getCountCameras() {
        return countCameras;
    }

    public void setCountCameras(String countCameras) {
        this.countCameras = countCameras;
    }
}
