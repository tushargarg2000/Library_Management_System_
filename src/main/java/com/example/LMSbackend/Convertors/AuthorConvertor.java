package com.example.LMSbackend.Convertors;

import com.example.LMSbackend.Models.Author;
import com.example.LMSbackend.RequestDto.AuthorRequestDto;

public class AuthorConvertor {


    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){

        Author author = Author.builder().
                            name(authorRequestDto.getName())
                                    .age(authorRequestDto.getAge()).country(authorRequestDto.getCountry())
                .email(authorRequestDto.getEmail()).build();


        return  author;
    }


}
