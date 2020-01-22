package com.mjtool.mjtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
public class MjtoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MjtoolApplication.class, args);
	}

}
