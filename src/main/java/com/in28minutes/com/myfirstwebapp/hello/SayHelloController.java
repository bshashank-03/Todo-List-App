package com.in28minutes.com.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

//	"say-Hello"-> "Hello! What are you Learning today?"
	
//	http://localhost:8080/say-Hello
	@RequestMapping("say-Hello-html")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you Learning today?";
	}
	
//	URL-> "say-Hello-jsp" => sayHello.jsp
	// "say-hello-jsp" => sayHello.jsp 
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
