package org.alyne.soares;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/org/alyne/soares/features/BuySnacksAndDrinks.feature"},
        strict = false, plugin = {"pretty",
        "html:target/reports"}
      //  glue = {"com.automatedtest.sample.infrastructure.driver",
      //          "com.automatedtest.sample.homepage"}
      )
public class RunFeatureBuySnacksAndDrinks {
}