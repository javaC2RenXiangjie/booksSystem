package app.entities;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "books")
public class BooksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "book_name")
    private String bookName;
    private String author;
    @Column(name = "pub_company")
    private String pubCompany;
    @Column(name = "i_s_b_n")
    private String isbn;
    @Column(name = "fixed_price")
    private String fixedPrice;
    @Column(name = "pub_date")
    private Date pubDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubCompany() {
        return pubCompany;
    }

    public void setPubCompany(String pubCompany) {
        this.pubCompany = pubCompany;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(String fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}
