package AutoScout.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class bewerbungTest {
    WebDriver driver;
    WebDriverWait wait;
    String marke= "Ford";

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.autoscout24.de/");
    } @Test
    public void searchCarTest() throws InterruptedException {

        try {
            WebElement cookieAccept = wait.until(ExpectedConditions.elementToBeClickable(

                    By.xpath("//div/button[text()='Alle akzeptieren']")
            ));
            cookieAccept.click();
            System.out.println("Cookie wurde akzeptiert");
        } catch (Exception e) {
            System.out.println("Cookie rejected");
        }
        Thread.sleep(2);

        // Marken auswählen
        Select markaSelect = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("make"))));
        markaSelect.selectByVisibleText(marke);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("model")));


        //Model auswählen
        WebElement modelDropdown = driver.findElement(By.name("model"));
        Select modelSelect = new Select(modelDropdown);
        modelSelect.selectByVisibleText("Alle Modelle");


        WebElement minFiyat = driver.findElement(By.name("price"));
        minFiyat.sendKeys("5000");
        Thread.sleep(2);



        WebElement suchenButton = driver.findElement(By.id("search-mask-search-cta"));
        suchenButton.click();
        Thread.sleep(3);

        WebElement firstItem= driver.findElement(By.className("ListItem_version__5EWfi"));
        Thread.sleep(4);
        System.out.println(firstItem.getText());
        String firstInhalt= firstItem.getText();
        firstItem.click();
        Thread.sleep(3);
        WebElement itemName= driver.findElement(By.className("StageTitle_modelVersion__Yof2Z"));
        String secondInhalt=itemName.getText();
        System.out.println(secondInhalt);

        Assert.assertTrue(firstInhalt.contains(secondInhalt));


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
