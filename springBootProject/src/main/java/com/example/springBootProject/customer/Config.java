package com.example.springBootProject.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Config 类 获取application.yml中定义的属性值
 * @author renxw
 * @version 20180725
 */
@Component
@ConfigurationProperties(prefix="my")
public class Config {

	private  List<String> servers = new ArrayList<String>();
	
	public	List<String> getServers(){
		return this.servers;
	}
	
}
