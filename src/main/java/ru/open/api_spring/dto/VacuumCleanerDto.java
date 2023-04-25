package ru.open.api_spring.dto;

import ru.open.api_spring.dto.common.ModeBaseDto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class VacuumCleanerDto extends ModeBaseDto {
    @NotBlank
    private Integer countDustCollector;

    @NotBlank
    private Integer countModes;

    public Integer getCountDustCollector() {
        return countDustCollector;
    }

    public void setCountDustCollector(Integer countDustCollector) {
        this.countDustCollector = countDustCollector;
    }

    public Integer getCountModes() {
        return countModes;
    }

    public void setCountModes(Integer countModes) {
        this.countModes = countModes;
    }
}
