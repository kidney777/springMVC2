package com.java.controller.front;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HttpSessionMutexListener;

import com.java.entity.User;

/**
 * @author Kidney
 * @version 创建时间：2019年1月21日 下午3:38:57 类说明
 */
@Controller
@Scope("prototype")
public class HomeController {
	@RequestMapping(value = "test1")
	public void test1(User user) {
		System.out.println("test1");
		System.out.println(user);
	}

	@RequestMapping(value = "test2")
	public void test2(@RequestParam(name = "user", defaultValue = "hehe", required = true) String username,
			@RequestParam(name = "age1", required = true) Integer age,
			@RequestParam(name = "pass", required = false) String password) {

		System.out.println(username);
		System.out.println(age);
		System.out.println(password);
	}

	@RequestMapping("test3")
	public String test3(String user, String pass, Integer age) {
		if ("admin".equals(user) && "123".equals(pass)) {
			return "redirect:/pages/front/success.jsp";
		} else {

			return "/pages/front/fail.jsp";
		}
	}

	@RequestMapping("test5")
	public String test5() {
		return "front/success.jsp";
	}

	@RequestMapping("test6")
	public String test6(String user, String pass, Integer age, Model model, Map<String, Object> map) {

		System.out.println(user);
		System.out.println(age);
		System.out.println(pass);
		model.addAttribute("username", user);
		model.addAttribute("password", pass);
		model.addAttribute("age", age);

		if ("admin".equals(user) && "123".equals(pass)) {
			return "front/success.jsp";
		} else {

			return "front/fail.jsp";
		}
	}

	@RequestMapping("test7")
	public String test7(Map<String, Object> map, String user, Integer age, String pass, HttpSession session) {
		map.put("username", user);
		map.put("age", age);
		map.put("password", pass);
		map.put("session", session);
		return "front/success.jsp";	

	}
	
	@RequestMapping("test9")
	public void test9(){
		int i = 10/0;
	}
	
//	@ExceptionHandler(Exception.class)
//	public String exceptHand(Exception ex){
//		ex.printStackTrace();
//		System.out.println("error happended");
//		return "front/error.jsp";
//	}



}
