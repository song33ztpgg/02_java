package io.basic;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 표준입력인 키보드 입력을 받아서 
 * 입력된 내용을 파일로 출력하는 클래스 
 * 
 * =입력 
 * 1.node stream (키보드 =  System.in : inputStream) 
 * 2.filter stream (stream -- > reader : InputStreamReader 
 * 3.filter stream ( reader - > reader : BufffereReader) 
 * 4. 3의 filter stream 을 통해 1줄 단위 입력을 지원하는  
 *    readLine()을 사용 
 *     
 * 
 * =출력
 * 5.node stream 파일- 문서저장(writer) :FileWriter 
 * 6.filter stream ( writer --> writer : PrintWriter) 
 * 7. 6의 filter stream 을 통해서 1줄 단위 출력을 지원하는 
 * 	  println()을 사용 
 * 
 * --정리 
 * 8.입력에서 마지막으로 사용된 filter Stream 닫기
 * 9.출력에서 마지막으로 사용된 filter Stream 닫기
 * 
 * */

public class KeyboardInputFileOutput {

	public static void main(String[] args) throws IOException {

		//1.입력 : node stream : System.in 
		InputStream in = System.in; 
		//2.입력 filter stream : stream --> reader 
		InputStreamReader ir = new InputStreamReader(in); 
		
		//3.입력 : filter stream : reader : 
		BufferedReader br = new BufferedReader(ir); 
		
		//5.출력 : node stream : file : FileWriter 
		FileWriter fw = new FileWriter("out.txt"); 
		
		//6.출력 : filter stream  : writer -- > writer 
		PrintWriter out = new PrintWriter(fw); 
		
		//4.입력 filter stream 에서 읽이 
		System.out.println("값입력 "); 
		
		String readData = null; 
		while ((readData = br.readLine()) != null) { 
			//7. 출력 filter stream 에사용 
			out.println(readData); 
			//화면 출력
			System.out.println("읽음 " +readData );
		} 
		
		br.close(); 
		out.close();
	}

}
