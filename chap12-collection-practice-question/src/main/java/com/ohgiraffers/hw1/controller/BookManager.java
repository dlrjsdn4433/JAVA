package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.*;


public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager(){
        this.bookList = new ArrayList<>();
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
            BookDTO o = this.bookList.get(i);
            if(o.getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        System.out.println(bookList.get(index));

    }

    public void displayAll() {
        for( int i = 0 ; i < bookList.size(); i ++ ) {
            System.out.println(bookList.get(i));
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){ //책 제목 기준으로 오름차순 내림차순
        Comparator<? extends BookDTO> Comparator;
        if(select==1){bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        }else{bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getTitle().compareTo(o1.getTitle());
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

}
