package ru.yandex;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderStatusTest {

    @Test
    public void checkOrderStatusWithUnknownNumber()   {

//        MainPage mainPage = open(MainPage.URL, MainPage.class);
        MainPage mainPage = new MainPage();

        mainPage.cookieButtonClickIsDisplayed();
        mainPage.clickButtonStatusOrder();
        mainPage.sendKeysInvalidOrderNumber("5555555555");
        mainPage.clickButtonGo();
        assertTrue(mainPage.isOrderNotFoundImageDisplayed());

    }
}
