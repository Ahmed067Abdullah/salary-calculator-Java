package teachers.salary.calculator;

public class resultNotFoundException extends Exception {

   String str1;
   
   resultNotFoundException(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return (str1) ;
   }    
}
