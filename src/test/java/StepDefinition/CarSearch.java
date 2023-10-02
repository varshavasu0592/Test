package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CarSearch {

    public static WebDriver driver;

    @Before
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario)

    {
        if(scenario.isFailed())
        {

            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","sample.png");
        }
        driver.quit();
    }
    @Given("I am on the HomePage {string} of carsguide website")
    public void i_am_on_the_home_page_of_carsguide_website(String url) {
        driver.get(url);
    }
    @When("i navigate to carsforsale menu")
    public void i_navigate_to_carsforsale_menu() {
    }
    @Then("i click on searchcars")
    public void i_click_on_searchcars() {
        Actions actions = new Actions(driver);
        WebElement ele  =driver.findElement(By.xpath("//a[contains(@data-gtm-label,'buy and sell')]"));
        actions.moveToElement(ele).build().perform();
        driver.findElement(By.xpath("//a[text()='Search Cars']")).click();
    }
    @Then("i select Make as {string}")
    public void i_select_make_as(String make) {

        Select selectmake = new Select(driver.findElement(By.id("makes")));
        selectmake.selectByVisibleText(make);
    }
    @Then("i select model as {string}")
    public void i_select_model_as(String model) {

        Select selectmodel = new Select(driver.findElement(By.id("models")));
        selectmodel.selectByVisibleText(model);
    }
    @Then("i select location as {string}")
    public void i_select_location_as(String location) {
        Select selectlocation = new Select(driver.findElement(By.id("locations")));
        selectlocation.selectByVisibleText(location);
    }
    @Then("i select price as {string}")
    public void i_select_price_as(String price) {
        Select selectprice = new Select(driver.findElement(By.id("priceTo")));
        selectprice.selectByVisibleText(price);
    }
    @Then("i click on Find My Next Car Button")
    public void i_click_on_find_my_next_car_button() {
        driver.findElement(By.id("search-submit")).click();
    }
    @Then("i should see list of searched cards and the page title should be {string}")
    public void i_should_see_list_of_searched_cards_and_the_page_title_should_be(String expected) {

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(@class,'title')]")));
        WebElement title = driver.findElement(By.xpath("//h1[contains(@class,'title')]"));
        String actual = title.getText();
        Assert.assertTrue(actual.contains(expected));

    }

}
