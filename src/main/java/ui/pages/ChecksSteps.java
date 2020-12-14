package ui.pages;

import org.assertj.core.api.SoftAssertions;
import ui.pages.mailCabinet.popUp.PopUp;

import java.util.Map;

import static ui.utils.Waits.waitElement;

public class ChecksSteps {
    PopUp popUp;

    /**
     * Метод проверки появления сообщения об отправке письма
     */
    public void checkWhatMessageWasSent() {
        popUp = new PopUp();
        waitElement(popUp.headerEmailSendingStatus, 10);
    }
}
