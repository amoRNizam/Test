package ui.pages.mailCabinet.mainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.base.WebTestRunner;

public class MainPage extends WebTestRunner {

    public MainPage() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "compose-button__txt")
    public WebElement writeALetterButton;

}
