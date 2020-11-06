package com.example.demo;

import com.example.demo.api.Source;
import com.example.demo.dto.SourceDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SourceMapper {

	SourceDto toDto(Source input);
	Source toApi(SourceDto input);
}
