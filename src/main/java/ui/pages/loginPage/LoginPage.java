package ui.pages.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.base.WebTestRunner;

public class LoginPage extends WebTestRunner {

    public LoginPage() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(name = "login")
    public WebElement loginInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = ".//div[@id='mailbox']//child::button[contains(string(), 'Ввести пароль')]")
    public WebElement goToPasButton;

    @FindBy(xpath = ".//div[@id='mailbox']//child::button[contains(string(), 'Войти')]")
    public WebElement loginButton;

}
