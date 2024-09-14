package helloP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloPController {
	@GetMapping("/bye")
	public String bye() {
		return "bye";
	}

}
