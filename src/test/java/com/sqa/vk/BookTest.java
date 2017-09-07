package com.sqa.vk;

import org.testng.annotations.*;

public class BookTest {

	@Test
	public void testBook() {
		System.out.println("Testing Book");
		Book[] book = new Book[4];
		book[0] = new Book(234, false);
		book[1] = new Book(429);
		book[2] = new Book(true);
		book[3] = new Book(409);
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i]);
			book[i].read(350);
			book[i].turnPage(370);
			book[i].closeBook(false);
			System.out.println();
		}
		System.out.println();
	}
}
