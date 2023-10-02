package StepDefinition;



    import org.apache.commons.io.FileUtils;
    import org.openqa.selenium.By;
    import org.openqa.selenium.OutputType;
    import org.openqa.selenium.TakesScreenshot;
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

    import java.io.File;
    import java.io.IOException;

public class Parallel {
        public WebDriver driver;
        @Test
        public void FirefoxTest() throws IOException, InterruptedException {
            //Initializing the firefox driver (Gecko)
            driver = new FirefoxDriver();
            driver.get("https://www.google.com");



            driver.quit();
        }

        @Test
        public void ChromeTest() throws Exception {
            //Initialize the chrome driver
            driver = new ChromeDriver();
            driver.get("https://www.google.com");

            if(driver.findElements(By.xpath("//*[text()='Accept all']")).size()!=0)
            {
                driver.findElement(By.xpath("//*[text()='Accept all']")).click();
            }
            Thread.sleep(5000);
            TakesScreenshot scrShot =((TakesScreenshot)driver);
            File f =  scrShot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(f,new File("src/test/Screenshots/screenshot.jpg"));
            driver.quit();
        }
    }

