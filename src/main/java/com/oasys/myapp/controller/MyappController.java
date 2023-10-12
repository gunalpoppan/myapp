package com.oasys.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyappController {
@GetMapping("/myapp")
public String getmsg() {
	return "god is love";
}
}
