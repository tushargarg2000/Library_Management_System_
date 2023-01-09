package com.example.LMSbackend.Repository;

import com.example.LMSbackend.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
