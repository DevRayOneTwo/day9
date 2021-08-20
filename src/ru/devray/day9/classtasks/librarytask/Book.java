package ru.devray.day9.classtasks.librarytask;

public class Book {
    //название, автор, год публикации, ISBN

    String bookName;
    String author;
    int yearOfPublish;
    String isbn;

    public Book(String bookName, String author, int yearOfPublish, String isbn) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
