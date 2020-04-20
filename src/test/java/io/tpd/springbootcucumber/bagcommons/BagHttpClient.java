/**
 * 
 */
package io.tpd.springbootcucumber.bagcommons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.tpd.springbootcucumber.Bag;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;
/**
 * @author Kuna
 *
 */
@Component

@Scope(SCOPE_CUCUMBER_GLUE)
public class BagHttpClient {

	private final Logger log = LoggerFactory.getLogger(BagHttpClient.class);
	private final String SERVER_URL = "http://localhost";
    private final String THINGS_ENDPOINT = "/things";

    @LocalServerPort
    private int port;
    private final RestTemplate restTemplate = new RestTemplate();


    private String thingsEndpoint() {
    	log.info("the endpoint url is "+SERVER_URL + ":" + port + THINGS_ENDPOINT);
        return SERVER_URL + ":" + port + THINGS_ENDPOINT;
    }

    public int put(final String something) {
        return restTemplate.postForEntity(thingsEndpoint(), something, Void.class).getStatusCodeValue();
    }

    public Bag getContents() {
        return restTemplate.getForEntity(thingsEndpoint(), Bag.class).getBody();
    }

    public void clean() {
        restTemplate.delete(thingsEndpoint());
    }

}
