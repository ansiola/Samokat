package ru.yandex;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckLogoTest {


    @Test
    public void checkLogoScooter() {
        MainPage mainPage = new MainPage();

//        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.cookieButtonClickIsDisplayed();
        mainPage.clickLogoScooter();
        assertTrue(mainPage.isPageWebDisplayed());
    }

    @Test
    public void checkLogoYandex() {
        MainPage mainPage = new MainPage();

//        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.cookieButtonClickIsDisplayed();
        mainPage.clickLogoYandex();
        switchTo().window(0);
        switchTo().window(1);
        assertTrue(mainPage.checkLinkYandex());


    }
}
