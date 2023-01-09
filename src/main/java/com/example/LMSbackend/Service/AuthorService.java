package com.example.LMSbackend.Service;


import com.example.LMSbackend.Convertors.AuthorConvertor;
import com.example.LMSbackend.Models.Author;
import com.example.LMSbackend.Repository.AuthorRepository;
import com.example.LMSbackend.RequestDto.AuthorRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorRequestDto authorRequestDto){

        try {
            Author author = AuthorConvertor.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
        }catch (Exception e){
            log.info("createAuthor has caused an error");
            return "Create author didnt work";
        }
        return "Author created successfully";
    }

}
