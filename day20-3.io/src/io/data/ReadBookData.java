package io.data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 객체의 데이터가 담긴 파일을 읽어서 
 * 데이터 단위로 입력받고 그 내용을 객체로 생성 
 * 
 * --입력-- 
 * 1.node stream (파일 :FileInputStream) 
 * 2.filter stream ( 데이터 단위 입력 : DataInputStream) 
 * 3.read작업 : filter stream 메소드 사용
 * readInt() 등등  
 * 
 * --출력-- 
 * 4.read를 통해서 얻은 값들로 Book 객체 생성 
 * 5.4에서 만들어진 Book 객체 표준 출력 
 * 
 * 
 * --정리---
 * 입력 filter stream 닫기
 * 
 * @author Administrator
 *
 */

public class ReadBookData {

	public static void main(String[] args) throws IOException { 
		
		FileInputStream fis = new FileInputStream("book.data"); 
		
		//2.입력 filter stream : DataInputStream
		DataInputStream in = new DataInputStream(fis); 
		
		
		//3.read작업 
		//3.1 book객체 생성에 필요한 값을 읽어서 변수에 담기 
			// 순서중요
		int sequence = in.readInt(); 
		String isbn = in.readUTF(); 
		String title = in.readUTF(); 
		String author = in.readUTF();	
		String company = in.readUTF(); 
		int totalPage = in.readInt(); 
		int price = in.readInt();
		int quantity = in.readInt(); 
		
		
		
		
		//3.2 book 객체 생성
		// 순서중요
		Book vegiterian = new Book(sequence, isbn,title, author,company ,totalPage,price ,quantity);
				
		//4.표준  출력 
		System.out.println(vegiterian); 
		
		//5.
		in.close();
		
		
		
	}

}
