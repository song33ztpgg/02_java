package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

	
//야구구간의 1~ㅍ 5 선수 방어율읿력하고 그중 방어률이 낮ㅂ은 최고의 튜스를 찾는 클래스 
// 몇번째팀 몇번째선수		
		Scanner scan = new Scanner(System.in); 
		double[][] ERA = new double[3][5]; 
		double min = 10.0; 
		double player =0;  
		int tem = 0; 
		int player2 = 0;
		
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");  
		for(int i= 0; i < ERA.length ; i++) { 
			System.out.printf("%d 번째 팀 1~5 투수 방어율 : " , i +1); 
			for(int j = 0 ; j < ERA[i].length ; j++) { 
				player = scan.nextDouble(); 
				ERA[i][j] = player; 
			} 
			System.out.println();
		} 
		
		
		  
		for(int i= 0; i < ERA.length ; i++) {  
			for(int j = 0 ; j < ERA[i].length ; j++) { 
				
				if(ERA[i][j] < min) { 
					min = ERA[i][j]; 
					tem = i; 
					player2 = j;
				}  
			}
		} 
		
		System.out.printf("최고의 선수는 %d팀의 %d번째 선수이며 \n방어율은 %.2f 입니다", tem + 1,player2+1,ERA[tem][player2]);
		


		
		
		
}}


