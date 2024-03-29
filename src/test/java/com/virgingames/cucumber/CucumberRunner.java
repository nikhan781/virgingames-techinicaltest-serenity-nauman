package com.virgingames.cucumber;

import com.virgingames.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature/feedCRUD.feature")
public class CucumberRunner extends TestBase {
}
