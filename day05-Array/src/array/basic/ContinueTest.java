package array.basic;

public class ContinueTest {
	public static void main(String[] args) {
	int sum; 
	sum = 0;
	for(int i = 0;i < 100 ; i++) { 
		{
			if(i % 2 == 0) //continue; 
			sum +=i;
		}
	} 
}
}