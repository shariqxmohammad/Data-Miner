package controllers;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public ModelAndView titlePage() {

		ModelAndView modelandview = new ModelAndView("index");	

		return modelandview;
	}
}

