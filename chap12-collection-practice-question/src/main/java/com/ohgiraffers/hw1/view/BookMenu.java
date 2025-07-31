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
                case 1: // 해결
                    bmanager.addBook(bmenu.inputBook());
                    break;
                    
                case 2:
                    sc.nextLine();
                    System.out.println("1. 오름차순 2.내림차순");
                    int snum = sc.nextInt();
                    bmanager.printBookList(bmanager.sortedBookList(snum));
                    break;

                    
                case 3: // 해결
                    sc.nextLine();
                    System.out.println("삭제할 도서의 제목을 입력해주세요 : ");
                    String a = sc.nextLine();
                    bmanager.deleteBook(bmanager.searchBook(a));
                    break;
                    
                case 4: // 해결
                    System.out.println("조회할 도서의 제목을 입력해주세요 : ");
                    int bnum = bmanager.searchBook(bmenu.inputBookTitle());
                    if(bnum == -1){
                        System.out.println("조회한 도서가 존재하지 않습니다.");
                    } else {
                        bmanager.printBook(bnum);
                    }
                    break;

                case 5: // 해결
                    bmanager.displayAll();
                    break;

                case 6: // 해결
                    break;
            }

            if(num==6){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }



    public BookDTO inputBook(){
        BookDTO bDTO = new BookDTO();
        Scanner sc = new Scanner(System.in);

        System.out.println("도서 번호 : ");
        int bnum = sc.nextInt();
        bDTO.setbNO(bnum);
        sc.nextLine();

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
        String title = sc.nextLine();
        return title;
    }


}
