package ru.yandex;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
//        public static final String URL = "https://qa-scooter.praktikum-services.ru/";

        @FindBy(how = How.ID, using = "App_CookieText")         // веб элемент куки: "И здесь куки! В общем, мы их используем."
        private SelenideElement elementCookie;
        private SelenideElement buttonCookie = $("#rcc-confirm-button");

        @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g") // кнопка "Заказать" сверху страницы
        private SelenideElement buttonOrderHeader;
        private SelenideElement buttonOrderCentral = $(".Home_FinishButton__1_cWm");

        @FindBy(how = How.CSS, using = ".Header_Link__1TAG7")         // кнопка "Статус заказа"
        private SelenideElement buttonStatusOrder;

        @FindBy(how = How.CSS, using = ".Input_Input__1iN_Z")        //локатор поля ввода номера заказа
        private SelenideElement orderNumberInput;

        @FindBy(how = How.CLASS_NAME, using = "Track_NotFound__6oaoY")  // изображение "такого заказа не существует"
        private SelenideElement orderNotFoundImage;

        @FindBy(how = How.CSS, using = ".Header_LogoYandex__3TSOI")  // Логотип Яндекса
        private SelenideElement logoYandex;

        @FindBy(how = How.CSS, using = ".Header_LogoScooter__3lsAR")  // Логотип Самоката
        private SelenideElement logoScooter;

        @FindBy(how = How.CSS, using = ".Header_Button__28dPO")   // кнопка проверки заказа сразу после бронирования
        private SelenideElement buttonGo;

        private SelenideElement scrollToDown = $(".Home_StatusBrick__1PsW9:nth-child(4) > div:nth-child(2)");

        @FindBy(how = How.CSS, using = "#root > div > div > div.Home_FourPart__1uthg > div.Home_SubHeader__zwi_E") // локатор блока "Вопросы о важном"
        private SelenideElement FAQ;

        @FindBy(how = How.ID, using = "accordion__heading-0")   // локатор кнопки вопроса "Сколько это стоит? И как оплатить?"
        private SelenideElement question1;
        @FindBy(how = How.ID, using = "accordion__heading-1")  //локатор кнопки вопроса "Хочу сразу несколько самокатов! Так можно?"
        private SelenideElement question2;
        @FindBy(how = How.ID, using = "accordion__heading-2")      //локатор кнопки "Как рассчитывается время аренды?"
        private SelenideElement question3;
        @FindBy(how = How.ID, using = "accordion__heading-3")  //локатор кнопки "Можно ли заказать самокат прямо на сегодня?"
        private SelenideElement question4;
        @FindBy(how = How.ID, using = "accordion__heading-4")  //локатор кнопки "Можно ли продлить заказ или вернуть самокат раньше?"
        private SelenideElement question5;
        @FindBy(how = How.ID, using = "accordion__heading-5")  //локатор кнопки "Вы привозите зарядку вместе с самокатом?"
        private SelenideElement question6;
        @FindBy(how = How.ID, using = "accordion__heading-6")           //локатор кнопки "Можно ли отменить заказ?"
        private SelenideElement question7;
        @FindBy(how = How.ID, using = "accordion__heading-7")          //локатор кнопки "Я жизу за МКАДом, привезёте?"
        private SelenideElement question8;


        @FindBy(how = How.CSS, using = "#accordion__panel-0 > p")  // локатор кнопки ответа "Сколько это стоит? И как оплатить?"
        private SelenideElement answerQuestion1;
        @FindBy(how = How.CSS, using = "#accordion__panel-1 > p")  // локатор кнопки ответа "Хочу сразу несколько самокатов! Так можно?"
        private SelenideElement answerQuestion2;
        @FindBy(how = How.CSS, using = "#accordion__panel-2 > p")  // локатор кнопки ответа "Как рассчитывается время аренды?"
        private SelenideElement answerQuestion3;
        @FindBy(how = How.CSS, using = "#accordion__panel-3 > p")  // локатор кнопки ответа "Можно ли заказать самокат прямо на сегодня?"
        private SelenideElement answerQuestion4;
        @FindBy(how = How.CSS, using = "#accordion__panel-4 > p")  // локатор кнопки ответа "Можно ли продлить заказ или вернуть самокат раньше?"
        private SelenideElement answerQuestion5;
        @FindBy(how = How.CSS, using = "#accordion__panel-5 > p")  // локатор кнопки ответа "Вы привозите зарядку вместе с самокатом?"
        private SelenideElement answerQuestion6;
        @FindBy(how = How.CSS, using = "#accordion__panel-6 > p")  // локатор кнопки ответа "Можно ли отменить заказ?"
        private SelenideElement answerQuestion7;
        @FindBy(how = How.CSS, using = "#accordion__panel-7 > p")  // локатор кнопки ответа "Я жизу за МКАДом, привезёте?"
        private SelenideElement answerQuestion8;

        @FindBy(how = How.CLASS_NAME, using = "App_App__15LM-")        // страница сайта
        private SelenideElement pageWeb;

        @FindBy(how = How.CSS, using = ".home-logo.home-arrow__logo")        // страница сайта Yandex
        private SelenideElement linkYandex;


        public boolean isPageWebDisplayed() {return pageWeb.isDisplayed();} //метод отображения изображения созданного заказа

        public MainPage clickButtonOrderHeader() {buttonOrderHeader.click();return this;} // метод клика кнопки "Заказать" вверху страницы

        public MainPage clickButtonOrderCentral() {buttonOrderCentral.click();return this;} // метод клика кнопки "Заказать" в центре страницы

        public boolean isOrderNotFoundImageDisplayed() {return orderNotFoundImage.isDisplayed();} //метод отображения изображения некорректного номера заказа

        public MainPage clickButtonStatusOrder() {buttonStatusOrder.click();return this;}  // клик кнопки проверки статуса заказа

        public MainPage scrollToFAQ() {FAQ.scrollTo();return this;}  //скролл страницы вниз до блока "Вопросы о важном"

        public MainPage clickQuestion1() {question1.click();return this;}         // метод клика на вопрос №1
        public MainPage clickQuestion2() {question2.click();return this;}         // метод клика на вопрос №2
        public MainPage clickQuestion3() {question3.click();return this;}         // метод клика на вопрос №3
        public MainPage clickQuestion4() {question4.click();return this;}         // метод клика на вопрос №4
        public MainPage clickQuestion5() {question5.click();return this;}         // метод клика на вопрос №5
        public MainPage clickQuestion6() {question6.click();return this;}         // метод клика на вопрос №6
        public MainPage clickQuestion7() {question7.click();return this;}         // метод клика на вопрос №7
        public MainPage clickQuestion8() {question8.click();return this;}       // метод клика на вопрос №8

        public MainPage checkTextQuestion1() {question1.shouldHave(exactText("Сколько это стоит? И как оплатить?"));return this;}
        public MainPage checkTextQuestion2() {question2.shouldHave(exactText("Хочу сразу несколько самокатов! Так можно?"));return this;}
        public MainPage checkTextQuestion3() {question3.shouldHave(exactText("Как рассчитывается время аренды?"));return this;}
        public MainPage checkTextQuestion4() {question4.shouldHave(exactText("Можно ли заказать самокат прямо на сегодня?"));return this;}
        public MainPage checkTextQuestion5() {question5.shouldHave(exactText("Можно ли продлить заказ или вернуть самокат раньше?"));return this;}
        public MainPage checkTextQuestion6() {question6.shouldHave(exactText("Вы привозите зарядку вместе с самокатом?"));return this;}
        public MainPage checkTextQuestion7() {question7.shouldHave(exactText("Можно ли отменить заказ?"));return this;}
        public MainPage checkTextQuestion8() {question8.shouldHave(exactText("Я жизу за МКАДом, привезёте?"));return this;}

        public MainPage checkTextAnswerQuestion1() {answerQuestion1.shouldHave(text("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));return this;}
        public MainPage checkTextAnswerQuestion2() {answerQuestion2.shouldHave(text("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));return this;}
        public MainPage checkTextAnswerQuestion3() {answerQuestion3.shouldHave(text("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));return this;}
        public MainPage checkTextAnswerQuestion4() {answerQuestion4.shouldHave(text("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));return this;}
        public MainPage checkTextAnswerQuestion5() {answerQuestion5.shouldHave(text("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));return this;}
        public MainPage checkTextAnswerQuestion6() {answerQuestion6.shouldHave(text("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));return this;}
        public MainPage checkTextAnswerQuestion7() {answerQuestion7.shouldHave(text("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));return this;}
        public MainPage checkTextAnswerQuestion8() {answerQuestion8.shouldHave(text("Да, обязательно. Всем самокатов! И Москве, и Московской области."));return this;}


        public boolean checkLinkYandex() {linkYandex.shouldBe(Condition.exist);return linkYandex.isDisplayed();}

        public void sendKeysInvalidOrderNumber(String invalidOrderNumber) {orderNumberInput.sendKeys(invalidOrderNumber);} // метод заполнения поля "Комментарий"

        public void clickLogoYandex() {logoYandex.click();}        // метод клика на логотип Яндекса

        public void clickLogoScooter() {logoScooter.click();}        // метод клика на логотип Яндекса

        public void clickButtonGo() {buttonGo.click();}             // метод клика кнопки "GO"

        public void scrollToScrollToDown() {scrollToDown.scrollTo();}  // метод скролла вниз страницы

        public void cookieButtonClickIsDisplayed() {                    // проверка отображения кнопки куки на странице сайта и клик
                if (buttonCookie.isDisplayed()) {
                        buttonCookie.click();
                }
        }


}



