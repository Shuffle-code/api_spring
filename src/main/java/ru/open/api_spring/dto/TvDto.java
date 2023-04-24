package ru.open.api_spring.dto;

import ru.open.api_spring.dto.common.ModeBaseDto;
import javax.validation.constraints.NotNull;
public class TvDto extends ModeBaseDto {
    @NotNull
    private String technology;
    @NotNull
    private String category;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "TvDto{" +
                "technology='" + technology + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
