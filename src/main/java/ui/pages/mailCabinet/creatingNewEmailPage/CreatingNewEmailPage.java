package ui.pages.mailCabinet.creatingNewEmailPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.base.WebTestRunner;

public class CreatingNewEmailPage extends WebTestRunner {
    public CreatingNewEmailPage() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = ".//div[contains(@class, 'contactsContainer')]//child::input")
    public WebElement recipient;

    @FindBy(name = "Subject")
    public WebElement messageSubject;

    @FindBy(xpath = ".//div[@role='textbox']")
    public WebElement messageTextInputArea;

    @FindBy(xpath = ".//span[@title='Отправить']")
    public WebElement sendButton;

}
