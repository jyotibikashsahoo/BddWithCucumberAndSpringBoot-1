/**
 * 
 */
package io.tpd.springbootcucumber;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kuna
 *
 */
@RestController
@RequestMapping("/things")
public class BagController {
	private final Bag bag = new Bag();

	@GetMapping
	public Bag getBag() {
		return bag;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void addThing(@RequestBody final String something) {
		bag.add(something);
	}

	@DeleteMapping
	public void removeEverything() {
		bag.removeEverything();
	}
}
