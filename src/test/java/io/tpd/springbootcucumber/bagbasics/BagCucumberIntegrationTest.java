/**
 * 
 */
package io.tpd.springbootcucumber.bagbasics;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Kuna
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
        plugin = {"pretty", "html:target/cucumber/bagbasics","json:target/report/json/bagBasics_cucumber.json"},
        extraGlue = "io.tpd.springbootcucumber.bagcommons")
public class BagCucumberIntegrationTest {

}
