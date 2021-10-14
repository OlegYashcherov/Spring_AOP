package com.olegyashcherov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter_02_AroundTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Book book = context.getBean("book", Book.class);
        book.setBookName("Азазель");

        Library library = context.getBean("library", Library.class);
        String bookName = library.returnBook(book);
        System.out.println("В библиотеку вернули " + bookName);

        context.close();
    }
}
