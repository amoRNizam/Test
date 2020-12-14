package ui.pages.mailCabinet.creatingNewEmailPage;

import ui.resources.Message;

import static ui.utils.Waits.waitElement;

public class StepsCreatingNewEmailPage {
    CreatingNewEmailPage creatingNewEmailPage;

    /**
     * Метод заполнения письма
     */
    public void fillOutTheEmail(Message message) {
        creatingNewEmailPage = new CreatingNewEmailPage();
        waitElement(creatingNewEmailPage.recipient, 10)
                .sendKeys(message.recipient);

        waitElement(creatingNewEmailPage.messageSubject, 10)
                .sendKeys(message.messageSubject);

        waitElement(creatingNewEmailPage.messageTextInputArea, 10)
                .sendKeys(message.messageText);
    }

    /**
     * Метод отправки
     */
    public void sendMessage() {
        creatingNewEmailPage = new CreatingNewEmailPage();
        waitElement(creatingNewEmailPage.sendButton, 10)
                .click();
    }
}
