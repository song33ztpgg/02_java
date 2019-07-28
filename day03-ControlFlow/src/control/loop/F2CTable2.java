package control.loop;

public class F2CTable2 {

	public static void main(String[] args) {
		double C = 0.0; 
		double F = 0.0;
		
		for(int i=0; i<= 10 ; i++) { 
			
			
			C = ((5.0/9.0) * (F - 32.00));
			System.out.printf("%.2f F = %.2f C\n",F , C);
			F += 10.0;
		}
		
	 //System.out.println("dd");	
	
//	for(F = 0.0 ; F <= 100.0  ; F +=10.0) { 
//		C = ((5.0/9.0) * (F - 32.00));
//		System.out.printf("%.2f F = %.2f C\n",F , C);
//	} 
//	
	
		
	

}
}
