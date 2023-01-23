package com.example.demo.service.mapper;

import com.example.demo.model.Book;
import com.example.demo.controller.dto.BookDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 10:03:25 AM
*/
@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toEntity(BookDTO dto);

    BookDTO toDto(Book entity);

}