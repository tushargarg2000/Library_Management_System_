package com.example.LMSbackend.Service;


import com.example.LMSbackend.Enums.CardStatus;
import com.example.LMSbackend.Models.Card;
import com.example.LMSbackend.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {


    public Card createCard(Student student){

        Card newCard = new Card();


        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student); //For that new foreign key column

        return newCard;
    }


    //findById
    //



}
