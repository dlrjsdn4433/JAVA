package com.ohgiraffers.practice02.level02.book;

public class Application {
    public static void main(String[] args) {

        BookDTO book = new BookDTO();


        book.printInformation();
        book.BookDTO("자바의 정석","도우출판","남궁성");
        book.printInformation();
        book.BookDTO("홍길동전","활빈당","허균",5000000,0.5);
        book.printInformation();


    }
}
