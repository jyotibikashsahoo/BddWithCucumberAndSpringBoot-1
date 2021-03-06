/**
 * 
 */
package io.tpd.springbootcucumber.bagcommons;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.Given;

/**
 * @author Kuna
 *
 */
public class BagCommonCucumberStepDefinitions {
	
	@Autowired
    private BagHttpClient bagHttpClient;

    @Given("^the bag is empty$")
    public void the_bag_is_empty() {
        bagHttpClient.clean();
        assertThat(bagHttpClient.getContents().isEmpty()).isTrue();
    }

}
