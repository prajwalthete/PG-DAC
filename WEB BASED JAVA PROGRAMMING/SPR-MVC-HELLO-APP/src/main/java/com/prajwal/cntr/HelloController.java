package com.prajwal.cntr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = { "/hello.htm" })
	public String sayHello(ModelMap model) {
		model.put("msg", "Hello Spring MVC !!!!!!!!"); // model data
		return "info"; // view name
	}

}
// http://localhost:8080/HibernateApp2/hello.htm......in the url type this last hello.htm 