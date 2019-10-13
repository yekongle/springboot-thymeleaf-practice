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
		String name = "肥婆敏";
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String content ="你这死肥猪，快点起床吃饭啦！";
		model.addAttribute("name", name);
//		model.addAttribute("time", time);
		model.addAttribute("content", content);
		return "hello";
	}
	
}
