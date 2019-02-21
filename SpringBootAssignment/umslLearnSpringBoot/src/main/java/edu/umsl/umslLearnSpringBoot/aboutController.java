package edu.umsl.umslLearnSpringBoot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aboutController {

		//inject the message via applicaiton.properties
		@Value("${about.message:test}")
		private String message = "";
		
		@RequestMapping("/about")
		public String welcome(Map<String, Object> model){
			
			model.put("message", this.message);
			return "about";
		}
	}
