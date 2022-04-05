package ru.yandex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


// 2 теста с разными данными в браузере хром как того требовало задание к финальному проекту

public class OrderTestChrome {


    @Test
    public void testFillFormForOrderChromeFirst() {                             // позитивный сценарий заказа с ошибкой в браузере хром

//        MainPage mainPage = open(MainPage.URL, MainPage.class);
        MainPage mainPage = new MainPage();

        mainPage.cookieButtonClickIsDisplayed();
        mainPage.scrollToScrollToDown();
        mainPage.clickButtonOrderCentral();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.setValueNameField("Анастасия");
        orderPage.setValueLastNameField("Артемьева");
        orderPage.setValueAddressField("Москва");
        orderPage.clickSubwayField();
        orderPage.clickChooseSubwayStation();
        orderPage.setValueMobileField("89994441155");
        orderPage.clickNextButton();
        orderPage.clickDatePickerField();
        orderPage.clickRandomDate();
        orderPage.clickDropdownFilledDate();
        orderPage.clickChooseDropdownOption();
        orderPage.clickCheckBoxInputColorGrey();
        orderPage.setValuePlaceholder("Привет");
        orderPage.clickButtonMakeOrder();
        boolean expectedResult = orderPage.getConfirmOrder();
        Assertions.assertTrue(expectedResult, "Всплывающее окно с подтверждением заказа не появилось");


    }

    @Test
    public void testFillFormForOrderChromeSecond() {           // позитивный сценарий заказа с ошибкой в браузере хром
        MainPage mainPage = new MainPage();

//        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.cookieButtonClickIsDisplayed();
        mainPage.clickButtonOrderHeader();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.setValueNameField("Евпатий");
        orderPage.setValueLastNameField("Коловрат");
        orderPage.setValueAddressField("ул. Кукушкина, д. 10");
        orderPage.clickSubwayField();
        orderPage.clickChooseSubwayStation();
        orderPage.setValueMobileField("89994441155");
        orderPage.clickNextButton();
        orderPage.clickDatePickerField();
        orderPage.clickRandomDate();
        orderPage.clickDropdownFilledDate();
        orderPage.clickChooseDropdownOption();
        orderPage.clickCheckBoxInputColorBlack();
        orderPage.setValuePlaceholder("Пожалуйста не звоните в звонок, а постучите в дверь");
        orderPage.clickButtonMakeOrder();
        boolean expectedResult = orderPage.getConfirmOrder();
        Assertions.assertTrue(expectedResult, "Всплывающее окно с подтверждением заказа не появилось");
    }
}
