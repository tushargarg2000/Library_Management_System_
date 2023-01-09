package com.example.LMSbackend.Controllers;


import com.example.LMSbackend.RequestDto.AuthorRequestDto;
import com.example.LMSbackend.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/create")
    public String createAuthor(@RequestBody()AuthorRequestDto authorRequestDto){

        return authorService.createAuthor(authorRequestDto);
    }

}
