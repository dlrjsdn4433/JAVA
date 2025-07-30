package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);

    public void menu() {

        BookMenu bmenu = new BookMenu();
        BookManager bmanager = new BookManager();

        while(true){
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");

            int num = sc.nextInt();

            switch(num){
                case 1: bmanager.addBook(bmenu.inputBook());break;
                case 2:
                case 3:
                    System.out.println("도서 삭제 : ");
                    String dbook = sc.nextLine();
                    bmanager.deleteBook(bmanager.searchBook(dbook));
                case 4:
                    int bnum = bmanager.searchBook(bmenu.inputBookTitle());
                    if(bnum == -1){
                        System.out.println(bnum);
                        System.out.println("출력할 도서가 없습니다.");
                    } else {
                        System.out.println(bnum);
                        bmanager.printBook(bnum);
                    }
                    break;
                case 5: bmanager.displayAll();
                case 6:
            }
        }
    }



    public BookDTO inputBook(){
        BookDTO bDTO = new BookDTO();
        Scanner sc = new Scanner(System.in);

        System.out.println("도서 번호 : ");
        int bnum = sc.nextInt();
        bDTO.setbNO(bnum);

        System.out.println("도서 제목 : ");
        String btitle = sc.nextLine();
        bDTO.setTitle(btitle);

        System.out.println("도서 장르 : ");
        int bcategory = sc.nextInt();
        bDTO.setCategory(bcategory);
        sc.nextLine();

        System.out.println("도서 저자 : ");
        String bauthor = sc.nextLine();
        bDTO.setAuthor(bauthor);

        return bDTO;
    }

    public String inputBookTitle(){
        System.out.println("도서 제목 : ");
        sc.nextLine();
        String title = sc.nextLine();
        return title;
    }


}
