package com.project.burgerking.web.controller;

//github 테스트입ㄴ디ㅏ.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
	@GetMapping("")
	public String Test() {
		return "testtt";
	}
}
