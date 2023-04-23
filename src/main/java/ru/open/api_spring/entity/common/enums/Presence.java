package ru.open.api_spring.entity.common.enums;
public enum Presence {
        AVAILABLE("доступно"),
        NOT_AVAILABLE("не доступно");
        private final String title;

    Presence(String title) {
        this.title = title;
    }
}
