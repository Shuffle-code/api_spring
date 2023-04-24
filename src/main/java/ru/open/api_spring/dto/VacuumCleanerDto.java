package ru.open.api_spring.dto;

import ru.open.api_spring.dto.common.ModeBaseDto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class VacuumCleanerDto extends ModeBaseDto {
    @NotBlank
    private String countDustCollector;

    @NotBlank
    private String countModes;

    public String getCountDustCollector() {
        return countDustCollector;
    }

    public void setCountDustCollector(String countDustCollector) {
        this.countDustCollector = countDustCollector;
    }

    public String getCountModes() {
        return countModes;
    }

    public void setCountModes(String countModes) {
        this.countModes = countModes;
    }
}
