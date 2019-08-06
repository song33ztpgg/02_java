package io.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 바이트 처리만 할 수 있는 
 * 
 * 이미지 파일을 입력으로 받아서 이미지 파일로 출력하는  
 *  == stream 으로만 작업하는 
 * 이미지 복사 클래스 
 *   
 * @author Administrator
 *
 *--입력 
 *1.node stream(stream : FileInputStream) ==>한줄 출력안됨
 *2. read 작업 : node stream 메소드  read(byte[])
 *
 *--출력 
 *3.node stream(stream :FileOutputStream) 
 *4.write 작업  : node stream 메소드 write(byte[])
 *
 *--정리
 *5.입력 닫기, 출력닫기
 */
public class ImageCopy {

	public static void main(String[] args) throws IOException {

		//1.입력 node stream : FileInputStream 
		FileInputStream in = new FileInputStream("pic.jpg"); 
		
		//3.출력 node stream : FileOutputStream 
		FileOutputStream out = new FileOutputStream("pic-copied.jpg"); 
		
		//출력 node stream 선언 초기화 완료 
		
		//2.read 작업  read(byte[]) a메소드  
		// 읽기 작업의 매개변수로 사용될 
		//byte[]을 선언 
		
		//2.1 바이트 배열 : buffer 
		byte[] buffer  = new byte[4096]; 
		
		//2.2 read(byte[]) 
		
		int readSize = 0; 
		int repeat = 0; 
		//2.3 read() 
		while ((readSize = in.read(buffer)) != -1) { 
			//4.write(byte[] )작업
			out.write(buffer);
			System.out.printf("읽은 바이트 :%d \t 반복횟수 : %d%n" , readSize , ++repeat);
		}
		
		
		//화면 작업 내용 출력 
		
		
		System.out.println("이미지 복사 완료"); 
		
		
		in.close(); 
		out.close();
		
		
		
		
	}

}
