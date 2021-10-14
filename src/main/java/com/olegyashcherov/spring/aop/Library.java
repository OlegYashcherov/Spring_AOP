package com.olegyashcherov.spring.aop;

public class Library {
    public void getBook(String bookName) {
        System.out.println("Take the book: " + bookName);
    }

    public String returnBook(Book book) {
//        System.out.println("Return the book: " + book.getBookName());
        System.out.println("AroundAspect возвращает результат");
        return book.getBookName();
    }


}
