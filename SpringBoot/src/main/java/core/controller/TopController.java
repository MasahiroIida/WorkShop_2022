package core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

	@RequestMapping(value="/top")
	public String top() {
		return "/";
	}
}
