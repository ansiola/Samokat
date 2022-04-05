package ru.yandex;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static help.RandomDate.randomDate;


public class OrderPage {

    @FindBy(how = How.CSS, using = ".Order_Form__17u6u > div:nth-child(1) > input:nth-child(1)")     //  поле имени
    private SelenideElement nameField;

    @FindBy(how = How.CSS, using = ".Input_InputContainer__3NykH:nth-child(2) > input:nth-child(1)") //  поле фамилии
    private SelenideElement lastNameField;

    @FindBy(how = How.CSS, using = ".Input_InputContainer__3NykH:nth-child(3) > input:nth-child(1)") // поле адреса
    private SelenideElement addressField;

    private SelenideElement randomDate = $(".react-datepicker__day--0" + randomDate(10, 30));    // выбор рандомной даты календаря

    private SelenideElement chooseDropdownOption = $(".Dropdown-menu").find(".Dropdown-option"); // выбор станции метро

    @FindBy(how = How.CSS, using = ".select-search")                              // кнопка выпадающего списка метро
    private SelenideElement subwayField;

    @FindBy(how = How.CSS, using = ".Input_InputContainer__3NykH:nth-child(5) > input:nth-child(1)") // поле ввода мобильного телефона
    private SelenideElement mobileField;

    @FindBy(how = How.CSS, using = ".select-search")     // кнопка выпадающего списка метро
    private SelenideElement parentDiv;

    @FindBy(how = How.CSS, using = ".Button_Middle__1CSJM") // кнопка "Заказать" в центре главной страницы
    private SelenideElement nextButton;

    @FindBy(how = How.CSS, using = ".react-datepicker-wrapper") // календарь "Когда привезти самокат"
    private SelenideElement datePickerField;

    @FindBy(how = How.CSS, using = ".Dropdown-root") // поле выпадающего списка "Срок аренды"
    private SelenideElement dropdownFilledDate;

    @FindBy(how = How.CSS, using = "#black") // чекбокс Цвет самоката: чёрный жемчуг
    private SelenideElement checkboxInputColorBlack;

    @FindBy(how = How.CSS, using = "#grey")  // чекбокс Цвет самоката: серая безысходность
    private SelenideElement checkboxInputColorGrey;

    @FindBy(how = How.CSS, using = ".Input_InputContainer__3NykH:nth-child(4) > input:nth-child(1)") // поле "Комментарий для курьера"
    private SelenideElement placeholder;

    @FindBy(how = How.CSS, using = ".Button_Middle__1CSJM:nth-child(2)") // кнопка "Заказать"
    private SelenideElement buttonMakeOrder;

    @FindBy(how = How.CSS, using = ".Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)")  // кнопка согласия на создание заказа
    private SelenideElement buttonOrderAgree;

    @FindBy(how = How.CSS, using = ".Order_NextButton__1_rCA > button:nth-child(1)")   // кнопка проверки заказа сразу после бронирования
    private SelenideElement buttonCheckStatus;

//    @FindBy(how = How.CSS, using = ".Order_Content__bmtHS")   // элемент формы заказа: "Для кого самокат"
    private SelenideElement elementOrderContent = $(".Order_Content__bmtHS");

//    @FindBy(how = How.CSS, using = ".Input_Visible___syz6")   //  "Введите корректное имя"
    private SelenideElement incorrectName = $(".Input_Visible___syz6");

//    @FindBy(how = How.CSS, using = ".Input_InputContainer__3NykH:nth-child(2) > div:nth-child(2)")   // "Введите корректную фамилию"
    private SelenideElement incorrectLastName = $(".Input_InputContainer__3NykH:nth-child(2) > div:nth-child(2)");

//    @FindBy(how = How.CSS, using = ".Input_InputContainer__3NykH:nth-child(3) > div:nth-child(2)")   // "Введите корректный адрес"
    private SelenideElement incorrectAddress = $(".Input_InputContainer__3NykH:nth-child(3) > div:nth-child(2)");

//    @FindBy(how = How.CSS, using = ".Input_InputContainer__3NykH:nth-child(5) > div:nth-child(2)")   // "Введите корректный номер"
    private SelenideElement incorrectMobilePhone = $(".Input_InputContainer__3NykH:nth-child(5) > div:nth-child(2)");

    @FindBy(how = How.CSS, using = ".Track_OrderInfo__2fpDL:nth-child(1)")   // "локатор созданного заказа"
    private SelenideElement orderFound;

    private SelenideElement orderModal = $(".Order_Modal__YZ-d3");
    private SelenideElement confirmOrder = $(".Order_ModalHeader__3FDaJ");


    public void setValueNameField(String name) {nameField.setValue(name);}     // метод заполнения поля имени

    public void setValueLastNameField(String lastname) {lastNameField.setValue(lastname);} // метод заполнения поля фамилии

    public void setValueAddressField(String address) {addressField.setValue(address);} // метод заполнения поля адрес

    public void setValueMobileField(String mobile) {mobileField.setValue(mobile);} // метод заполнения поля мобильного

    public void setValuePlaceholder(String comment) {placeholder.setValue(comment);} // метод заполнения поля "Комментарий"


    public OrderPage clickSubwayField() {subwayField.click(); return this;} // метод клика выбора метро

    public OrderPage clickChooseSubwayStation() {parentDiv.find("button").scrollTo().click(); return this;} // метод выбора станции метро

    public OrderPage clickNextButton() {nextButton.click(); return this;} // метод клика кнопки "Далее"

    public OrderPage clickDatePickerField() {datePickerField.click(); return this;} //  метод клика календаря

    public OrderPage clickRandomDate()  {randomDate.click(); return this;}       //  метод выбора рандомной даты календаря

    public OrderPage clickChooseDropdownOption()  {chooseDropdownOption.click(); return this;}  //  метод выбора чекбокса цвета самоката

    public OrderPage clickDropdownFilledDate() {dropdownFilledDate.click(); return this; } // метод клика выпадающего списка

    public OrderPage clickCheckBoxInputColorBlack() { checkboxInputColorBlack.click(); return this;} // метод выбора чекбокса №1

    public OrderPage clickCheckBoxInputColorGrey() { checkboxInputColorGrey.click(); return this;} // метод выбора чекбокса №2

    public OrderPage clickButtonMakeOrder() { buttonMakeOrder.click(); return this;} // метод создания заказа

    public OrderPage clickButtonOrderAgree()  { buttonOrderAgree.click(); return this;} // метод подтверждения создания заказа

    public OrderPage clickButtonCheckStatus() { buttonCheckStatus.click();  return this;} // клик кнопки проверки статуса заказа

    public OrderPage clickElementOrderContent() {elementOrderContent.click(); return this;} // клик на веб-элемент формы заполнения

    public OrderPage shouldExistIncorrectName() {incorrectName.should(exist); return this;} // метод проверки предупреждения некорректного ввода имени

    public OrderPage shouldVisibleIncorrectLastName() {incorrectLastName.should(visible); return this;} // метод проверки предупреждения некорректного ввода фамилии

    public OrderPage shouldExistIncorrectAddress() {incorrectAddress.should(exist); return this;} // метод проверки предупреждения некорректного ввода адреса

    public OrderPage shouldVisibleIncorrectMobilePhone() {incorrectMobilePhone.should(visible); return this;} // метод проверки предупреждения некорректного ввода мобильного телефона

    public boolean isOrderFoundDisplayed() {return orderFound.isDisplayed();} //метод отображения изображения созданного заказа

    public boolean getConfirmOrder() {orderModal.shouldBe(Condition.exist);return confirmOrder.isDisplayed();}  // метод отображения подтвержденного заказа


}

