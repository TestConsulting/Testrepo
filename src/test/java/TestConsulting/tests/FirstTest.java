package TestConsulting.tests;

import TestConsulting.pages.LoginPage;
import TestConsulting.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    WebDriver driver;
    LoginPage loginPage= new LoginPage();

    @BeforeMethod
    public void setUp()  {
      driver= WebDriverFactory.getDriver("chrome");
      driver.manage().window().fullscreen();
      driver.get("https://www.testconsulting.de/");

    }

    @Test
    public void jetztBewerben() throws InterruptedException {
        Thread.sleep(5);
        if (loginPage.erforderlicheCookie.isDisplayed()){
            loginPage.erforderlicheCookie.click();
            loginPage.karriereButton.click();     }
        else {
            loginPage.karriereButton.click();
        }

        Thread.sleep(2);
        loginPage.testAutomationEngineer.click();
        loginPage.name.sendKeys("Hilal");

    }
    @AfterMethod
    public void quit(){
         driver.quit();
    }

    }


