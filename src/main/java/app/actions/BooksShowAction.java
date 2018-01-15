package app.actions;

import app.controllers.BooksController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/booksShow")
public class BooksShowAction {

    private Logger logger = LoggerFactory.getLogger(BooksShowAction.class);

    @Autowired
    private BooksController booksController;

    @GetMapping(value = "")
    public String booksShow(Model model) {
        model.addAttribute("books", booksController.getAllBooks());
        return "booksShow";
    }
}
