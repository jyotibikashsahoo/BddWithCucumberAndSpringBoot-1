/**
 * 
 */
package io.tpd.springbootcucumber.bagextra;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Kuna
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagextra",
        plugin = {"pretty", "html:target/cucumber/bagextra","json:target/report/json/bagExtra_cucumber.json"},
        extraGlue = "io.tpd.springbootcucumber.bagcommons")
public class BagExtraCucumberIntegrationTest {

}
