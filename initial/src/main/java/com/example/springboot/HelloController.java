package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@PostMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
if [ $ret -ne 0 ]; then
exit $
if [ $ret -ne 0 ]; then
exit $ret
fi
rm -rf target

./gradlew build
ret=$?

}
