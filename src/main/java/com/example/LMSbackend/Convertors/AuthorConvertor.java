package com.example.LMSbackend.Convertors;

import com.example.LMSbackend.Models.Author;
import com.example.LMSbackend.RequestDto.AuthorRequestDto;
import com.example.LMSbackend.ResponseDto.AuthorResponseDto;
import com.example.LMSbackend.ResponseDto.BookResponseDto;

import java.util.ArrayList;
import java.util.List;

public class AuthorConvertor {


    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){

        Author author = Author.builder().
                            name(authorRequestDto.getName())
                                    .age(authorRequestDto.getAge()).country(authorRequestDto.getCountry())
                .email(authorRequestDto.getEmail()).build();


        return  author;
    }

    public static List<AuthorResponseDto> convertEntityToDto(List<Author>authors){

        List<AuthorResponseDto> authorResponseDtoList = new ArrayList<>();

        for(Author author: authors){

            AuthorResponseDto authorRequestDto = AuthorResponseDto.builder().id(author.getId()).name(author.getName()).age(author.getAge())
                    .country(author.getCountry()).email(author.getEmail()).build();

            //Try yourself on how to add BookResponseDto : Good exercise to practice.
            authorResponseDtoList.add(authorRequestDto);
        }

        return authorResponseDtoList;
    }


}
