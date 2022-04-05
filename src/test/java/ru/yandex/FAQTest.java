package ru.yandex;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FAQTest {

        @Test
        public void testQuestion1() {

               MainPage mainPage = new MainPage();
//        MainPage mainPage = open(MainPage.URL, MainPage.class);
                mainPage.cookieButtonClickIsDisplayed();
                mainPage.scrollToFAQ();
                mainPage.clickQuestion1();
                mainPage.checkTextQuestion1();
                mainPage.checkTextAnswerQuestion1();

        }

        @Test
        public void testQuestion2() {
                MainPage mainPage = new MainPage();

//                MainPage mainPage = open(MainPage.URL, MainPage.class);
                mainPage.cookieButtonClickIsDisplayed();
                mainPage.scrollToFAQ();
                mainPage.clickQuestion2();
                mainPage.checkTextQuestion2();
                mainPage.checkTextAnswerQuestion2();
        }

        @Test
        public void testQuestion3() {
                MainPage mainPage = new MainPage();

//                MainPage mainPage = open(MainPage.URL, MainPage.class);
                mainPage.cookieButtonClickIsDisplayed();
                mainPage.scrollToFAQ();
                mainPage.clickQuestion3();
                mainPage.checkTextQuestion3();
                mainPage.checkTextAnswerQuestion3();
        }


        @Test
        public void testQuestion4() {
                MainPage mainPage = new MainPage();

//                MainPage mainPage = open(MainPage.URL, MainPage.class);
                mainPage.cookieButtonClickIsDisplayed();
                mainPage.scrollToFAQ();
                mainPage.clickQuestion4();
                mainPage.checkTextQuestion4();
                mainPage.checkTextAnswerQuestion4();
        }


        @Test
        public void testQuestion5() {
                MainPage mainPage = new MainPage();

//                MainPage mainPage = open(MainPage.URL, MainPage.class);
                mainPage.cookieButtonClickIsDisplayed();
                mainPage.scrollToFAQ();
                mainPage.clickQuestion5();
                mainPage.checkTextQuestion5();
                mainPage.checkTextAnswerQuestion5();
        }
        @Test
        public void testQuestion6() {
                MainPage mainPage = new MainPage();

//                MainPage mainPage = open(MainPage.URL, MainPage.class);
                mainPage.cookieButtonClickIsDisplayed();
                mainPage.scrollToFAQ();
                mainPage.clickQuestion6();
                mainPage.checkTextQuestion6();
                mainPage.checkTextAnswerQuestion6();
        }


        @Test
        public void testQuestion7() {
                MainPage mainPage = new MainPage();

//                MainPage mainPage = open(MainPage.URL, MainPage.class);
                mainPage.cookieButtonClickIsDisplayed();
                mainPage.scrollToFAQ();
                mainPage.clickQuestion7();
                mainPage.checkTextQuestion7();
                mainPage.checkTextAnswerQuestion7();
        }


        @Test
        public void testQuestion8() {
                MainPage mainPage = new MainPage();

//                MainPage mainPage = open(MainPage.URL, MainPage.class);
                mainPage.cookieButtonClickIsDisplayed();
                mainPage.scrollToFAQ();
                mainPage.clickQuestion8();
                mainPage.checkTextQuestion8();
                mainPage.checkTextAnswerQuestion8();
        }
}