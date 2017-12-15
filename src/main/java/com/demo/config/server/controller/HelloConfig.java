package com.demo.config.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wwchang
 * @date 2017/12/5 10:55
 **/
@RestController
public class HelloConfig {

	@RequestMapping("/")
	public  String hello(){
		return "hello";
	}
}
