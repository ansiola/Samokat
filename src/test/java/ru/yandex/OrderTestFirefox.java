package ru.yandex;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static org.junit.jupiter.api.Assertions.assertTrue;

// в тестах данного класса присутствуют 2 теста с разными данными в браузере фаерфокс для прохождения сценария заказа до конца

public class OrderTestFirefox {

    @Test
    public void testFillFormForOrderFirefoxFirst() {              // позитивный сценарий заказа в браузере фаерфокс
        Configuration.browser = "firefox";
        MainPage mainPage = new MainPage();

//        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.cookieButtonClickIsDisplayed();
        mainPage.clickButtonOrderHeader();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.setValueNameField("Анастасия");
        orderPage.setValueLastNameField("Артемьева");
        orderPage.setValueAddressField("Москва");
        orderPage.clickSubwayField();
        orderPage.clickChooseSubwayStation();
        orderPage.setValueMobileField("89998885544");
        orderPage.clickNextButton();
        orderPage.clickDatePickerField();
        orderPage.clickRandomDate();
        orderPage.clickDropdownFilledDate();
        orderPage.clickChooseDropdownOption();
        orderPage.clickCheckBoxInputColorBlack();
        orderPage.setValuePlaceholder("Здрасьте");
        orderPage.clickButtonMakeOrder();
        orderPage.clickButtonOrderAgree();
        orderPage.clickButtonCheckStatus();
        assertTrue(orderPage.isOrderFoundDisplayed());

    }


    @Test
    public void testFillFormForOrderFirefoxSecond() {                                 // позитивный сценарий заказа в браузере фаерфокс
        Configuration.browser = "firefox";
        MainPage mainPage = new MainPage();

//        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.cookieButtonClickIsDisplayed();
        mainPage.scrollToScrollToDown();
        mainPage.clickButtonOrderCentral();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.setValueNameField("Люцифер");
        orderPage.setValueLastNameField("Морнингстар");
        orderPage.setValueAddressField("ул. Адовая, дом 13, кв 666");
        orderPage.clickSubwayField();
        orderPage.clickChooseSubwayStation();
        orderPage.setValueMobileField("89995552211");
        orderPage.clickNextButton();
        orderPage.clickDatePickerField();
        orderPage.clickRandomDate();
        orderPage.clickDropdownFilledDate();
        orderPage.clickChooseDropdownOption();
        orderPage.clickCheckBoxInputColorGrey();
        orderPage.setValuePlaceholder("Lux");
        orderPage.clickButtonMakeOrder();
        orderPage.clickButtonOrderAgree();
        orderPage.clickButtonCheckStatus();
        assertTrue(orderPage.isOrderFoundDisplayed());

    }

}










