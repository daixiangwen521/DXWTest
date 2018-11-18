package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello/{name}")
	@ResponseBody
	public String hello(@PathVariable String name){
		String url = "http://provider-user/hello/"+name; //这儿的url表示在eureka中注册的服务的服务名，在provider-user的.yml文件中有配置
		return this.restTemplate.getForObject(url, String.class);
	}
}
