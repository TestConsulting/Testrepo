package AutoScout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriverWait wait;

    @FindBy (id = "make")
    public WebElement alleMarken;

    @FindBy (name = "model")
    public WebElement alleModelle;

    @FindBy (id = "price")
    public WebElement price;

    @FindBy (xpath = "//button[contains(text(),'Suchen')]")
    public WebElement submit;

    @FindBy(xpath = "//h2/span[text()='BMW']")
    public WebElement markenName;
}
