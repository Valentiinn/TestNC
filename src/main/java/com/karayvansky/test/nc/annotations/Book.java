package com.karayvansky.test.nc.annotations;

import javax.persistence.*;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "book_id")
    private int id;
    @Column(name = "book_name")
    private String book_name;

    public Book(String book_name) {
        this.book_name = book_name;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    @Override
    public String toString() {
        return "Book: " + "\n" +
                "id: " + id + "\n" +
                "book_name: " + book_name + "\n";
    }
}
