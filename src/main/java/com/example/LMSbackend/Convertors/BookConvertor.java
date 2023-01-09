package com.example.LMSbackend.Convertors;

import com.example.LMSbackend.Models.Book;
import com.example.LMSbackend.RequestDto.BookRequestDto;

public class BookConvertor {


    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){

        Book book = Book.builder().name(bookRequestDto.getName()).genre(bookRequestDto.getGenre()) .build();

        return book;
    }


}
