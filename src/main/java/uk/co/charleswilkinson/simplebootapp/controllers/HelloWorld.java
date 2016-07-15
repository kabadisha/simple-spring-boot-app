package uk.co.charleswilkinson.simplebootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Charles Wilkinson on 15/07/2016.
 */
@Controller
public class HelloWorld {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String doInitialise(Model model,
							   HttpServletRequest request,
							   HttpServletResponse response) {

		return "Hello World";
	}
}
