package com.example.LMSbackend.Controllers;


import com.example.LMSbackend.RequestDto.BookRequestDto;
import com.example.LMSbackend.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    BookService bookService;

    @PostMapping("/createBook")
    public String createBook(@RequestBody()BookRequestDto bookRequestDto){

        return bookService.createBook(bookRequestDto);
    }
}
