package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.service.BookService;

public class BookUI {
	public static void main(String[] args) {
		int bookId=0;
		String title="";
		float price=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book id");
		bookId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the title of the string");
		title=sc.next();
		System.out.println("enetr the price ofthe book");
		price=sc.nextFloat();
		BookService bookService=new BookService();
		int updateCount=bookService.addBook(bookId,title,price);
		System.out.println(updateCount);
		
		
		
	}

}
