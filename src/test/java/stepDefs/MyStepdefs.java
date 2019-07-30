package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStepdefs {
    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    @Given("^I go to www\\.amazon\\.com$")
    public void iGoToWwwAmazonCom() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wormi\\IdeaProjects\\testCucumberProjectBeforeMentor\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("https://www.amazon.com/");
    }

    @When("^I hover to the sign in button$")
    public void iHoverToTheSignInButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"))).build().perform();
    }

    @And("^I wait till th dropdwon is visible$")
    public void iWaitTillThDropdwonIsVisible() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"nav-al-title\"]"))));
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
    }

    @Then("^I should be transferred to login page$")
    public void iShouldBeTransferredToLoginPage() {
        driver.close();
        driver.quit();
    }

}
