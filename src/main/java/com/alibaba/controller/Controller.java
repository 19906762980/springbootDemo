package com.alibaba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Controller")
public class Controller {

	@ResponseBody
	@RequestMapping("test1")
	public String test1() {
		return "12345688888889999000";
	}
}
