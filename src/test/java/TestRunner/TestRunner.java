package TestRunner;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/test/java/Features/Staging.feature",glue ="StepDefinition",plugin = {"html:target/cucumber-reports/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
    public class TestRunner {

    }


