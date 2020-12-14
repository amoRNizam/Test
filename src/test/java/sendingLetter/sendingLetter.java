package sendingLetter;

import org.testng.annotations.Test;
import ui.base.WebTestRunner;
import ui.pages.ChecksSteps;
import ui.pages.loginPage.StepsLoginPage;
import ui.pages.mailCabinet.creatingNewEmailPage.StepsCreatingNewEmailPage;
import ui.pages.mailCabinet.mainPage.StepsMainPage;
import ui.resources.Message;


public class sendingLetter extends WebTestRunner {

    ChecksSteps checksSteps;
    StepsLoginPage loginPage;
    StepsMainPage stepsMainPage;
    StepsCreatingNewEmailPage stepsCreatingNewEmailPage;

    @Test(description = "Авторизация в почте, написание и отправка письма")
    public void writingAndSendingALetter() {
        Message message = new Message(
                "mazin.roma1992@yandex.ru",
                "Test Message",
                "Текст письма");

        checksSteps = new ChecksSteps();
        loginPage = new StepsLoginPage();
        stepsMainPage = new StepsMainPage();
        stepsCreatingNewEmailPage = new StepsCreatingNewEmailPage();

        // Перейти на сайт mail.ru
        goToWebsite("https://mail.ru/");

        // Авторизоваться
        loginPage.login("testuser1992@mail.ru", "e8rrUIRiI2e(");

        // Перейти к созданию нового письма
        stepsMainPage.goToCreatingNewEmail();

        // Заполнить письмо
        stepsCreatingNewEmailPage.fillOutTheEmail(message);

        // Отправить письмо
        stepsCreatingNewEmailPage.sendMessage();

        // Проверить, что появилось окно с сообщением об успешной отправке письма
        checksSteps.checkWhatMessageWasSent();
    }
}
