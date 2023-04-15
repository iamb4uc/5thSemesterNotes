package csjava;
import java.util.*;
public class demoException2 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		 try{    
             int a[]=new int[5];    
              //a[5]=30/1;
             //a[2]=in.nextInt();
             //System.out.println(a[10]);  
             String s=null;  
             System.out.println(s.length());  
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            /*catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               } */
		    catch(NullPointerException e) {System.out.println("Null Pointer Exception");}
            System.out.println("rest of the code");    
 }
	}
