package homework5;

import java.util.*;

public class IsoscelesTriangleStars {
		int size;
	  void input(){
			Scanner s=new Scanner(System.in);
    		System.out.print("이등변삼각형 높이입력 : ");
    		this.size=s.nextInt();
         
    		print();
      	
      }
      void print(){
      	

    	  for(int i=1 ; i<=this.size ; i++) {  
    		  for(int j=1; j <= this.size-i ; j++) {  
    		  System.out.print(" ");   
    		  }  
    		  for(int k=1; k <=2*i-1; k++) {  
    		  System.out.print("*");    
    		  }  
    		  System.out.println("");  
    		              }  
      }
}
