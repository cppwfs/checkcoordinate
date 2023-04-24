package io.spring.checkcoordinate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;

import java.util.function.Function;

@SpringBootApplication
public class CheckcoordinateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckcoordinateApplication.class, args);
	}

	@Bean
	Function<String, String> checkCoordinate() {
		return s -> (StringUtils.commaDelimitedListToStringArray(s).length == 2) ? "Yep" : "Nope";
	}

}
