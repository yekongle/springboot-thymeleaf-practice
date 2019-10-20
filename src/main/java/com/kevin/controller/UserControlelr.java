package com.kevin.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
* @author Kevin Lau
* @version 创建时间：2019年10月13日 下午5:30:19
* @Description 类描述
*/
@Controller
public class UserControlelr {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		String name = "kevin";
//		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String content ="Drop the phone and study";
		model.addAttribute("name", name);
		model.addAttribute("content", content);
		return "hello";
	}
	
}
