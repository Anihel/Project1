package org.spring.learn.models;

public class Book {

    private int bookId;
    private String bookname;
    private String author;
    private int year;

    public Book() {
    }

    public Book(int book_id, String bookname, String author, int year) {
        this.bookId = book_id;
        this.bookname = bookname;
        this.author = author;
        this.year = year;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
