package ru.open.api_spring.entity.common.enums;

//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//
//@Getter
//@RequiredArgsConstructor
public enum TypeTechnics {
    TV("ТВ"),
    VACUUM_CLEANER("Пылесос"),
    FRIDGE("Холодильник"),
    SMARTPHONE("Смартфон"),
    PC("ПК");
    private final String title;

    TypeTechnics(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TypeTechnics{" +
                "title='" + title + '\'' +
                '}';
    }
}
