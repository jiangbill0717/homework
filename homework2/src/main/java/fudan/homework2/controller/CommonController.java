package fudan.homework2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping(value="/{pageId}")
	public String defaultMapping(@PathVariable String pageId) {
		return pageId;
	}
	
}
