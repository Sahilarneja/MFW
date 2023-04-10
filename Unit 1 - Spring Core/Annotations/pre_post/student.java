package com.springcore.pre_post;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class student implements InitializingBean, DisposableBean {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "student [name=" + name + "]";
}

public student() {
	super();
	// TODO Auto-generated constructor stub
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
}
}
