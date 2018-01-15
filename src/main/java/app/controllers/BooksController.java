package app.controllers;

import app.dtos.BooksDto;
import app.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/book")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping(value = "/")
    public List<BooksDto> getAllBooks() {
        return booksService.getAllBooks();
    }
}
