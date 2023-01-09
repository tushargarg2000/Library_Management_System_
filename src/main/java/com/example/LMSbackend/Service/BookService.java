package com.example.LMSbackend.Service;


import com.example.LMSbackend.Convertors.BookConvertor;
import com.example.LMSbackend.Models.Author;
import com.example.LMSbackend.Models.Book;
import com.example.LMSbackend.Repository.AuthorRepository;
import com.example.LMSbackend.Repository.BookRepository;
import com.example.LMSbackend.RequestDto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    public String createBook(BookRequestDto bookRequestDto){

        Book book = BookConvertor.convertDtoToEntity(bookRequestDto);

        //I need to set the AuthorEntity :

        int authorId = bookRequestDto.getAuthorId();

        //Getting the author Entity
        Author author  = authorRepository.findById(authorId).get();

        book.setAuthor(author);

        //That book list also needs to be updated

        List<Book> currentListOfBooks = author.getBooksWritten();
        currentListOfBooks.add(book);
        author.setBooksWritten(currentListOfBooks);

        //Save the author
        authorRepository.save(author);

        //Save the book
        bookRepository.save(book);

        return "succesfully added book";

    }

}
