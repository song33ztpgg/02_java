package io.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 문자파일에서 입력 받아서(문자 파일을 읽어서) 
 * 문자 파일로 출력(문자 파일로 쓰기) 하는 클래스
 * 
 *  --입력--
 * 1.node stream (파일(reader) : FileReader)
 * 2.filter stream (reader --> reader : BufferedReader)  = 1줄 읽기 
 * 3.입력 filter stream 의 줄단위 입력 메소드 readLine() 을 사용
 * 
 * 
 * --출력-- 
 * 4.node stream (문자(writer)파일 : FileWriter) 
 * 5.filter stream (writer -> writer : PrintWiter) 
 * 6.filter stream 의 줄단위 출력 메소드 사용 pritln() 
 * 
 * 
 * --정리--
 * 6.입력 filter stream 닫기
 * 7.출력 filter stream 닫기
 * */


public class TextFileCopy {

	public static void main(String[] args) throws IOException {
		//1.입력 node stream : FileReader 
		FileReader fr = new FileReader("out.txt"); 
		
		//2.입력 filter stream : BufferedReader 
		BufferedReader br = new BufferedReader(fr);  
		
		//==입력 스크림들 선언 초기화
		//4.
		FileWriter fw = new FileWriter("copied.txt");
		
		//5filter stream : PintWriter
		 PrintWriter out = new PrintWriter(fw); 
		 
		 //==츌력 스크림들 선언 초기화
		
		 String input = null; 
		 while ((input = br.readLine()) != null) { 
			 out.println("복사된 내용 " +input); 
			 //화면 출력 
			 System.out.println("파일에서 읽은 데이터 " +input); 
			 
			 System.out.println("복사완료"); 
		 }
			 //7.입력 filter steam 닫기 
			 br.close(); 
			 
			 out.close();
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
