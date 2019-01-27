/**
 * 
 */
package com.java.controller.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.entity.User;

/**
* @author Kidney
* 创建时间：2019年1月22日 上午7:08:18
* Description:
*/
/**
 * @author KIDNEY
 *
 */
@Controller
@RequestMapping(value = "/app/") // 中间虚拟URL添加————————									// http://localhost:8080/springMVC2/app/*
public class Test1Controller {
	@RequestMapping("test1")
	@ResponseBody // 用来返回特定的值
	public String test1() {
		return "666666";
	}
 

	@RequestMapping("test3")
	@ResponseBody // 用来返回特定的值
	public int test3() {
		return 444;
	}

	@RequestMapping("beanToJson")
	@ResponseBody
	public User beanToJson() {
		User user = new User();
		user.setAge(20);
		user.setPassword("234");
		user.setUsername("kkkkkk");
		return user;

	}

	@RequestMapping("mapToJson")
	@ResponseBody
	public Map<String, Object> mapToJson() {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", false);
		map.put("key2", "String");
		map.put("key3", 123.123);
		return map;
	}

	@RequestMapping("listToJson")
	@ResponseBody
	public List<Map<String, Object>> listToJson() {
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("key1", 111);
		map.put("key2", "String");
		map.put("key3", 123.123);
		map.put("key4", false);

		mapList.add(map);
		return mapList;
	}

}
