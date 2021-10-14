package com.olegyashcherov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter_01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Library library = context.getBean("library", Library.class);
        library.getBook("Продавец воздуха");

        Book book = context.getBean("book", Book.class);
        book.getBookName();

//        library.returnBook(book);

        context.close();
    }
}
