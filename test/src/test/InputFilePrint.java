package test;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
public class InputFilePrint {
 
    public static void main(String[] args) {   
         
        FileInputStream input = null;
        try{
            // 화면에 표시하고자 하는 파일을 선택한다.
            File file = new File("C:\\Users\\Administrator\\Desktop\\pak\\test.txt");
             
            // FileInputStream 는 File object를 생성자 인수로 받을 수 있다.         
            input = new FileInputStream(file);
            int i = 0;
            
            while((i = input.read()) != -1) {
                System.out.write(i);
                System.out.flush();
            }
            
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try{
                // 생성된 InputStream Object를 닫아준다.
                input.close();
            } catch(IOException io) {
            	
            }
        }
    	
    	
////    	String[] test = new String[3]; 
////    	test[0] = "1"; 
//    	
//    	byte[] test= {'a','b','c'};
////    	byte[] test3 = {'a'};
//    	
//    	try {
//			System.out.write(test);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//    	System.out.println(test); 
//    	
////    	System.out.write(test); 
//    	
//    	
    
       
        
    }
    
}


