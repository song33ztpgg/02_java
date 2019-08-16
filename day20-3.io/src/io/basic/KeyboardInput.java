package io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 표준 입력인 키보드 입력을 받아서 
 * 표준 출력인 모니터(콘솔창)출력하는 클래스 
 * 
 * 1.node stream (키보드  = system.in : InputSteam
 * 2.filter stream (stream --> reader : InputStreamReader) 
 * 	 2.1 바이트 키보드 인풋스트림을 
 * 	 2.2 바이트 문자로 변경 (키보드는 문자입력이기 때문에) 
 * 3.filter stream (reader --> reader : BufferedReader) 
 * 	 2바이트 문자를 1줄 단위로 읽어서 
 * 스트링으로 만들 수 있는 편리한 메소드를 사용하기 위해서 
 * 4. 3에서 만들어진 filter stram 객체를 사용해서 
 * 	  read()로 읽어들인다 
 * 5. 4에서 읽어들인 내용을 표준출력 (system으로 출력)
 * 6. 마지막 필터 스트림들을 닫아서 자원해제
 * */
public class KeyboardInput {

	public static void main(String[] args) throws IOException {

		//1.입력 스트림(표준입력 :키보드) 
		
		InputStream in = System.in;
		
		//2.노드 스트림을 포장할 필터 스트림 
		//inputStream => Reader 바꿔주는 필터 스크림 적용 
		InputStreamReader ir = new InputStreamReader(in); 
		
		//3. 2의 필터 스크림을 편리한 사용을 위한 
		//    다른 필터 스크림으로 포장 
		BufferedReader br = new BufferedReader(ir); 
		
		
		System.out.println("값을 입력하시오"); 
		System.out.println("crtl +z => 중단");
		
		//4. 3의 필터 스크림의 편리한 메소드 사용해서 읽기  
		
		String readData = null; 
		
		try {
			while((readData = br.readLine()) != null) { 
				
				//5.읽은 데이터가 null이 아니면 표준출력에 출력하기 
				System.out.println("읽은 데이터 : " +readData);	
			}
		} catch (IOException e) { 
				e.printStackTrace();
			} finally {
				
				try { 
					if (br != null); 
					br.close();
				} catch (IOException e) { 
					System.out.println("자원반납실패 " +e.getMessage());
					e.printStackTrace();
				}
			
			}
			
		}
		
		
	}

