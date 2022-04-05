package ru.yandex;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class CheckFieldsTest extends TestBase {


    @Test

    public void checkIncorrectFields() {

//        MainPage mainPage = open(MainPage.URL, MainPage.class);
        MainPage mainPage = new MainPage();

        mainPage.cookieButtonClickIsDisplayed();
        mainPage.scrollToScrollToDown();
        mainPage.clickButtonOrderCentral();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.setValueNameField("fff");
        orderPage.setValueLastNameField("fff");
        orderPage.setValueAddressField("fff");
        orderPage.setValueMobileField("fff");
        orderPage.clickElementOrderContent();
        orderPage.shouldExistIncorrectName();
        orderPage.shouldVisibleIncorrectLastName();
        orderPage.shouldExistIncorrectAddress();
        orderPage.shouldVisibleIncorrectMobilePhone();
    }

}
