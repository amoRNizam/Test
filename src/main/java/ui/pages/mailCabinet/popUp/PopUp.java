package ui.pages.mailCabinet.popUp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.base.WebTestRunner;

public class PopUp extends WebTestRunner {
    public PopUp() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = ".//div[@class='layer-sent-page']" +
            "//child::div[@class='layer__header' and contains(string(), 'Письмо отправлено')]")
    public WebElement headerEmailSendingStatus;

}
