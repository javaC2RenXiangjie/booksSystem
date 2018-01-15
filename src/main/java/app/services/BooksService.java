package app.services;

import app.dtos.BooksDto;

import java.util.List;

public interface BooksService {
    public List<BooksDto> getAllBooks();
}
