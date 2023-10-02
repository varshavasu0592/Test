package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumDriver;

public class CarsGuideHomePageActions  {

    public static WebDriver driver = SeleniumDriver.getDriver();
    @FindBy(how = How.XPATH,using = "//a[contains(@data-gtm-label,'buy and sell')]")
    public static WebElement carForSaleLink;

    @FindBy(how = How.XPATH,using = "//a[text()='Search Cars']")
    public static WebElement searchCars;

    @FindBy(how = How.LINK_TEXT,using = "Car Reviews")
    public static WebElement carReviewsLink;

    @FindBy(how = How.LINK_TEXT,using = "Search Cars")
    public static WebElement searchCarsLink;

    @FindBy(how = How.LINK_TEXT,using = "Used Car Search")
    public static WebElement usedCarsLink;

    @FindBy(how = How.ID,using = "makes")
    public static WebElement make;


    public static void  searchCar(){
        Actions actions = new Actions(driver);
        actions.moveToElement(carForSaleLink).build().perform();
        searchCars.click();
    }
public void clickCarSearch(){
    searchCars.click();
}


    public void select(WebElement ele,String value){
        Select selectmake = new Select(ele);
        selectmake.selectByVisibleText(value);
    }


    public static void CarsGuideHomePageActions()
    {

        PageFactory.initElements(SeleniumDriver.getDriver(),CarsGuideHomePageActions.class);
    }

    public static void moveToCarsForMenu()
    {
        Actions actions = new Actions(SeleniumDriver.getDriver());
        actions.moveToElement(carForSaleLink);
    }
}
