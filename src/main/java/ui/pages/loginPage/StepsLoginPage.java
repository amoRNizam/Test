package ui.pages.loginPage;

import ui.pages.mailCabinet.mainPage.MainPage;

import static ui.utils.Waits.waitElement;

public class StepsLoginPage {
    LoginPage loginPage;
    MainPage mainPage;

    /**
     * Метод авторизации пользователя через форму авторизации
     * @param nameEmail - Адрес почты
     * @param namePassword - Пароль от почты
     */
    public void login(String nameEmail, String namePassword) {
        loginPage = new LoginPage();

        // вводим адрес почты
        waitElement(loginPage.loginInput, 10)
                .sendKeys(nameEmail);

        // переходим к вводу пароля
        waitElement(loginPage.goToPasButton, 10)
                .click();

        // вводим пароль
        waitElement(loginPage.passwordInput, 10)
                .sendKeys(namePassword);

        // нажимаем кнопку входа
        waitElement(loginPage.loginButton, 10)
                .click();

        // Проверим, что открыта главная страница почты
        mainPage = new MainPage();
        waitElement(mainPage.writeALetterButton, 15);
    }
}
