package com.example.LMSbackend.ResponseDto;

import com.example.LMSbackend.Enums.Genre;
import lombok.Builder;

@Builder
public class BookResponseDto {

    String name;
    Genre genre;

}
