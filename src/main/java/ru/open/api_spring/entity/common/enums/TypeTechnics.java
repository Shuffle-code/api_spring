package ru.open.api_spring.entity.common.enums;

//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//
//@Getter
//@RequiredArgsConstructor
public enum TypeTechnics {
    TV("TV"),
    VACUUM_CLEANER("VACUUM_CLEANER"),
    FRIDGE("FRIDGE"),
    SMARTPHONE("SMARTPHONE"),
    PC("PC");
    private final String title;

    TypeTechnics(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
