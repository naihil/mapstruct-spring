package com.example.demo;

import com.example.demo.api.Source;
import com.example.demo.dto.SourceDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private SourceMapper mapper;

	@Test
	void contextLoads() {
	}

	@Test
	void testMapper() {
		final Source source = new Source();
		source.setId(1L);
		source.setTitle("Test");

		final SourceDto sourceDto = mapper.toDto(source);
		assertEquals(1L, sourceDto.getId());
		assertEquals("Test", sourceDto.getTitle());
	}
}
