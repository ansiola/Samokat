package ru.yandex;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public  class TestBase {

        @BeforeEach
    public void openURL(){  open("https://qa-scooter.praktikum-services.ru/");}
}
