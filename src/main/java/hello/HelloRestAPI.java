package hello ;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloRestAPI {
	
	@RequestMapping("/hello")
	public Hello hello () {
		return new Hello ();
	}

}
