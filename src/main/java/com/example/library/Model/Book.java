package com.example.library.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "Book")
public class Book {

    @Id
    private Integer book_id;


    private String book_name;


    private String book_category;


    private String author;

    public Book(String book_name, String book_category, String author) {
        this.book_name = book_name;
        this.book_category = book_category;
        this.author = author;
    }

    public Book() {
    }
}
