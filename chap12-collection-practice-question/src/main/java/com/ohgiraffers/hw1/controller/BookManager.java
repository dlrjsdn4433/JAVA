package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.*;


public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager(){
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book){
        bookList.add(book);
    }

    public void deleteBook (int index) {
        bookList.remove(index);
    }

    public int searchBook(String title) {
        int num=0;
        for(int i = 0; i < this.bookList.size();i++){
            if(bookList.get(i).getTitle().equals(title)){
                return i;
            }else{
                num=-1;
            }
        }
        return num;
    }

    public void printBook(int index) {
        System.out.println(bookList.get(index));

    }

    public void displayAll() {
        for( int i = 0 ; i < bookList.size(); i ++ ) {
            System.out.println(bookList.get(i));
        }
        if(bookList.isEmpty()){
            System.out.println("출력할 도서가 없습니다.");
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){ //책 제목 기준으로 오름차순 내림차순

        Comparator<? extends BookDTO> Comparator;
        if(select==1){
            System.out.println("오름차순으로 정렬합니다.");
            bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getCategory()-o2.getCategory();
            }
        });
        }else{
            System.out.println("내림차순으로 정렬합니다.");
            bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getCategory()-o1.getCategory();
            }
        });

        }

        ArrayList<BookDTO> sortedList = new ArrayList<>();
        for(int i = 0 ; i < bookList.size();i++){
            sortedList.add(bookList.get(i));
        }
        return sortedList;
    }

    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO b : br){
            System.out.println("b = " + b);
        }
    }

    public void noExistBook(String title){
        for(int i = 0; i<bookList.size();i++){

        }
    }

}
