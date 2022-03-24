package com.example1.demo1;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Demo1Application.class);
	}
	public static void main(Stirng args[]) {
		Scanner sc = new scanner(System.in);
	    int s  =nextInt(System.in);
	    char ch  = nextString(System.in);
	    double d= nextInt(System.in);
	    System.out.println(s+d);
	}

}
