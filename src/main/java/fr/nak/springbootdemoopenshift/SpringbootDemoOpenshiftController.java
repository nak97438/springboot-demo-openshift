package fr.nak.springbootdemoopenshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringbootDemoOpenshiftController {
	
	@GetMapping("/test")
	public String test () {
		return "test nak sur openshift";
	}
}
