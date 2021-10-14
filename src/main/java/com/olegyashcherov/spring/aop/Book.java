package com.olegyashcherov.spring.aop;

import org.springframework.beans.factory.annotation.Value;

public class Book {
    @Value("Тихий дон")
    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
