package TestConsulting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy (xpath = "//p/a[text()=' Jetzt bewerben!']")
    public WebElement jetztBewerbenButton;
    @FindBy(xpath = "//button[text()=\"Nur erforderliche Cookies erlauben\"]")
    public WebElement erforderlicheCookie;
    @FindBy(xpath = "//ul/li/a[text()='Karriere']")
    public WebElement karriereButton;
    @FindBy(xpath = "//a/h4[text()='Test Automation Engineer (m/w/d) ']")
    public WebElement testAutomationEngineer;
    @FindBy(name="name")
    public WebElement name;
}
