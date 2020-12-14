package ui.pages.mailCabinet.mainPage;

import ui.pages.mailCabinet.creatingNewEmailPage.CreatingNewEmailPage;

import static ui.utils.Waits.waitElement;

public class StepsMainPage {
    MainPage mainPage;
    CreatingNewEmailPage creatingNewEmailPage;

    /**
     * Метод перехода к созданию нового письма
     */
    public void goToCreatingNewEmail() {
        mainPage = new MainPage();
        waitElement(mainPage.writeALetterButton, 10)
                .click();

        // Проверим, что открыта страница создания нового сообщения
        creatingNewEmailPage = new CreatingNewEmailPage();
        waitElement(creatingNewEmailPage.messageTextInputArea, 15);
    }
}
