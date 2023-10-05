package Runners;

import io.cucumber.testng.*;

@CucumberOptions (
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)

public class _01_Runner extends AbstractTestNGCucumberTests {

}