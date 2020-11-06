package com.example.demo;

import com.example.demo.api.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private SourceMapper mapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final Source source = new Source();
		source.setId(1L);
		source.setTitle("title");
		System.out.println(mapper.toDto(source));
	}
}
