package ru.open.api_spring.dto;

import ru.open.api_spring.dto.common.ModeBaseDto;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class PCDto extends ModeBaseDto {

    @NotNull
    private String category;

    @NotNull
    private String typeProcessor;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTypeProcessor() {
        return typeProcessor;
    }

    public void setTypeProcessor(String typeProcessor) {
        this.typeProcessor = typeProcessor;
    }

    @Override
    public String toString() {
        return "PCDto{" +
                "category='" + category + '\'' +
                ", typeProcessor='" + typeProcessor + '\'' +
                '}';
    }
}
