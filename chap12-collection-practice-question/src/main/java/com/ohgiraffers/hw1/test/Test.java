package com.ohgiraffers.hw1.test;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        BookManager bm = new BookManager();
        BookMenu bmenu = new BookMenu();
        ArrayList<BookDTO> blist = new ArrayList<>();
        BookDTO book1 = new BookDTO(1,"제목1","저자1");
        BookDTO book2 = new BookDTO(2,"제목2","저자2");
        BookDTO book3 = new BookDTO(3,"제목3","저자3");
        //blist.add(book1);
        //blist.add(book2);
        //blist.add(book3);


        bm.addBook(bmenu.inputBook());







    }
}
