package homework5;
import java.util.*;
public class RectagleStars {
	 int size;
        void input(){
        	Scanner s=new Scanner(System.in);
    		System.out.print("���簢�� ũ���Է�:");
    		this.size=s.nextInt();
         
    		print();
        }
        void print(){
        	 for (int i = 0; i < this.size; i++) {
        		   for (int j = 0; j < this.size; j++) {
        		    System.out.print("*");
        		   }
        		   System.out.println(" ");
        		  }
        	        	
        }
}
