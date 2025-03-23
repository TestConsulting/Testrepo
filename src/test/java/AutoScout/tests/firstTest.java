package AutoScout.tests;

import AutoScout.pages.HomePage;
import TestConsulting.pages.LoginPage;
import TestConsulting.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class firstTest {



    WebDriver driver;
    HomePage homePage = new HomePage();
    WebDriverWait wait;

    @BeforeMethod
    public void setUp()  {

    }

    @Test
    public void firstTest() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().fullscreen();
        Thread.sleep(2);
        WebElement markaDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("make")));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(3);

        driver.get("https://www.autoscout24.de/?cq_src=google_ads&cq_cmp=9759674535&cq_term=autoscout24&cq_plac=&cq_net=g&cq_plt=gp&utm_source=google&utm_campaign=DE_AS24_ugom_web_lead_%5Bs%5D_%28B%29_Strict&utm_medium=cpc&utm_content=%28B%29_Strict&utm_term=autoscout24&gad_source=1&gclid=CjwKCAjwnPS-BhBxEiwAZjMF0qpdxICHAq6CQNj5wHoAJ86Jzfazl5VrEjpZAC4JhT1qNqU9kveM6hoC-20QAvD_BwE");



        Select markaSelect = new Select(markaDropdown);
        markaSelect.selectByVisibleText("Fiat");







    }
}
