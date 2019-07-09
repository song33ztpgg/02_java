package control.swch;
import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {

		double weight; 
		double height;  
		double bmi;
		String re;
		Scanner scan; 
		scan = new Scanner(System.in); 
		
		int z = 0;
		while(z < 10) {
		
		System.out.println("키(cm) / 몸무게를 입력하시오");
		height = scan.nextDouble();
		weight = scan.nextDouble(); 
		
		bmi = (weight/ (height*2)*100);  
		
		if(bmi > 40.0f) { 
			re = "병적인 비만"; 
		} else if(bmi > 27.5f) { 
			re = "비만";
		} else if(bmi > 23.0f) { 
		    re = "과체중";
		} else if(bmi > 18.5f) { 
			re = "정상";
		} else if(bmi > 15.0f) {
			re = "저체중";
		} else { 
			re = "병적인 저체중";
		} 
		
		
		System.out.printf("당신의 키 : %.2f\n당신의 몸무게 :%.2f\nBMI : %.2f\n당신은 %s입니다.\n " , height , weight , bmi , re); 
		System.out.printf("정상이 되기 위해서는 %.2f 만큼되어야 합니다." , Math.abs(20-bmi));
		System.out.printf("--------------------------------\n\n");
			
		z++;
		}
	}

}
