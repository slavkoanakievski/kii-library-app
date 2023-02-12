package com.example.library.Web;

import com.example.library.Model.Book;
import com.example.library.Service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public String findAll(Model model) {
        model.addAttribute("books", this.bookService.findAll());
        return "books";
    }
}
