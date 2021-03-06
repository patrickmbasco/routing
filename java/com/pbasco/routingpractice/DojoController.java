package com.pbasco.routingpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("{location}")
	public String dojo(@PathVariable("location") String location) {
		if(location.equals("dojo")) {
			return "The dojo is awesome!";
		}
		if(location.equals("burbank-dojo")) {
			return "Burbank dojo is located in southern california";
		}
		if(location.equals("san-jose")) {
			return "SJ Dojo is the headquarters";
		}
		return "";
		
	}
}
